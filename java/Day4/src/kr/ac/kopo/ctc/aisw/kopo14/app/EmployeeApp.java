package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.Contract;
import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;
import kr.ac.kopo.ctc.aisw.kopo14.model.Intern;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;

public class EmployeeApp {
    // === 다형성: Employee 타입으로 모든 직원 처리 ===
    static void printAll(Employee[] emps) {
        System.out.println("=== 전체 직원 목록 ===");
        for (Employee emp : emps) {
            emp.print();              // 각 타입에 맞게 출력
        }
    }

    static double calcTotalSalary(Employee[] emps) {
        double total = 0;
        for (Employee emp : emps) {
            total += emp.calcSalary(); // 각 타입에 맞게 계산
        }
        return total;
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new FullTime("김자바", 30, "개발팀", 5000),
                new FullTime("이스프링", 35, "백엔드팀", 6000),
                new Contract("박파이썬", 28, "데이터팀", 25000, 160),
                new Contract("최리액트", 26, "프론트팀", 20000, 140),
                new Intern("정코틀린", 22, "개발팀", 180)
        };

        printAll(employees);

        System.out.println("\n총 직원 수: " + Employee.getTotalCount());
        System.out.printf("총 월 급여: %.0f만원%n", calcTotalSalary(employees));
    }
}
