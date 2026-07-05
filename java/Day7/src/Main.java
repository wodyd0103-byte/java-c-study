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

    public static void main(String[] args) {
        EmployeeManager mgr1 = EmployeeManager.getInstance();
        EmployeeManager mgr2 = EmployeeManager.getInstance();
        System.out.println("같은 객체? " + (mgr1 == mgr2));  // true!

        mgr1.addEmployee(new FullTime("김자바", 30, "개발팀", 5000));
        System.out.println("mgr2에서 확인: " + mgr2.getCount() + "명");
    }
}
