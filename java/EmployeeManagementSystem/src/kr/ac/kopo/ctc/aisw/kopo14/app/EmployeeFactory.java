package kr.ac.kopo.ctc.aisw.kopo14.app;


import kr.ac.kopo.ctc.aisw.kopo14.model.Contract;
import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;
import kr.ac.kopo.ctc.aisw.kopo14.model.Intern;

public class EmployeeFactory {
    // === 정적 팩토리 메서드 ===
    public static Employee create(String type, String name, int age,
                                  String dept, double... params) {
        switch (type.toUpperCase()) {
            case "FULL":                           // 정규직
                return new FullTime(name, age, dept, params[0]);
            case "CONTRACT":                       // 계약직
                return new Contract(name, age, dept, params[0], (int) params[1]);
            case "INTERN":                         // 인턴
                return new Intern(name, age, dept, params[0]);
            default:
                throw new IllegalArgumentException("알 수 없는 직원 유형: " + type);
        }
    }

    public static void main(String[] args) {
        // === 팩토리로 객체 생성 — new를 직접 쓰지 않음! ===
        Employee e1 = EmployeeFactory.create("FULL", "김자바", 30, "개발팀", 5000);
        Employee e2 = EmployeeFactory.create("CONTRACT", "이파이썬", 28, "데이터팀", 25000, 160);
        Employee e3 = EmployeeFactory.create("INTERN", "정코틀린", 22, "개발팀", 180);

        e1.print();                                // 다형성: 각자의 print() 호출
        e2.print();
        e3.print();

        // 잘못된 타입 → 예외 발생
        try {
            Employee e4 = EmployeeFactory.create("FREELANCER", "박루비", 35, "외주팀", 300);
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}