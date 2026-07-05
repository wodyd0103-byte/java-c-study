package kr.ac.kopo.ctc.aisw.kopo14.model;

import kr.ac.kopo.ctc.aisw.kopo14.app.EmployeeFactory;

import java.io.*;
import java.util.ArrayList;

public class EmployeeManagerV3 {
    // === 싱글톤 ===
    private static EmployeeManagerV3 instance;   // 유일한 인스턴스
    private ArrayList<Employee> employees;

    private EmployeeManagerV3() {                 // private 생성자
        employees = new ArrayList<>();
    }

    public static EmployeeManagerV3 getInstance() {
        if (instance == null) instance = new EmployeeManagerV3();
        return instance;                          // 항상 같은 객체 반환
    }

    // === CRUD ===
    public void add(Employee emp) { employees.add(emp); }
    public Employee findByName(String name) {
        for (Employee e : employees)
            if (e.getName().equals(name)) return e;
        return null;                              // 못 찾으면 null
    }
    public int getCount() { return employees.size(); }

    // === 파일 저장 (팩토리 패턴 활용) ===
    public void loadFromCSV(String filename) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filename))) {
            reader.readLine();                    // 헤더 건너뛰기
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] p = line.split(",");
                    Employee emp = EmployeeFactory.create( // 팩토리!
                            p[0], p[1], Integer.parseInt(p[2]),
                            p[3], Double.parseDouble(p[4]));
                    employees.add(emp);
                } catch (Exception e) {
                    System.out.println("건너뜀: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("새 목록으로 시작합니다.");
        } catch (IOException e) {
            System.out.println("읽기 실패: " + e.getMessage());
        }
    }

    public void printAll() {
        System.out.println("=== 직원 목록 (" + getCount() + "명) ===");
        for (Employee e : employees) e.print();
    }
}

