package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.*;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;
import java.util.ArrayList;

public class EmployeeManager {
    // === 싱글톤 3요소 ===
    // ① private static 인스턴스: 유일한 객체
    private static EmployeeManager instance;

    // ② private 생성자: 외부에서 new 불가
    private EmployeeManager() {
        employees = new ArrayList<>();
        System.out.println("[싱글톤] EmployeeManager 생성됨");
    }

    // ③ public static getInstance(): 유일한 접근점
    public static EmployeeManager getInstance() {
        if (instance == null) {      // 아직 안 만들었으면
            instance = new EmployeeManager();  // 처음 한 번만 생성
        }
        return instance;             // 항상 같은 객체 반환
    }

    // === 비즈니스 로직 ===
    private ArrayList<Employee> employees;

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println(emp.getName() + " 추가! (총 " + employees.size() + "명)");
    }

    public int getCount() { return employees.size(); }

    // 테스트 격리를 위한 초기화 메서드
    public void clear() { employees.clear(); }

    public static void main(String[] args) {
        EmployeeManager mgr1 = EmployeeManager.getInstance();
        EmployeeManager mgr2 = EmployeeManager.getInstance();
        System.out.println("같은 객체? " + (mgr1 == mgr2));  // true!

        mgr1.addEmployee(new FullTime("김자바", 30, "개발팀", 5000));
        System.out.println("mgr2에서 확인: " + mgr2.getCount() + "명");
    }

    // 🌟 추가된 부분: 이름으로 직원 찾기
    public Employee findByName(String name) {
        for (Employee emp : employees) {
            // 직원의 이름과 찾고자 하는 이름이 같으면 해당 직원 객체 반환
            if (emp.getName().equals(name)) {
                return emp;
            }
        }
        return null;
    }
}