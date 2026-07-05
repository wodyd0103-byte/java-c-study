package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.EmployeeDao;
import kr.ac.kopo.ctc.aisw.kopo14.model.EmployeeDaoImpl;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;

import java.util.List;
import java.util.Scanner;

// 파일명이 반드시 EmployeeClient.java 여야 합니다!
public class EmployClient {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 직원 관리 시스템 ===");
            System.out.println("1. 직원 열람");
            System.out.println("2. 직원 정보 수정");
            System.out.println("3. 종료");
            System.out.print("선택: ");

            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("\n[직원 목록]");
                List<Employee> list = dao.readAll();
                for (Employee e : list) {
                    System.out.println("ID: "+e.getId()+", 이름: "+e.getName()+", 나이: "+e.getAge()+", 월급: "+e.calcSalary());
                }
            } else if (menu == 2) {
                System.out.print("\n수정할 직원의 ID: ");
                int id = scanner.nextInt();

                System.out.print("이름: ");
                String name = scanner.next();
                System.out.print("나이: ");
                int age = scanner.nextInt();
                System.out.print("부서: ");
                String dept = scanner.next();
                System.out.print("월급: ");
                int salary = scanner.nextInt();

                dao.update(id, new FullTime(name, age, dept, salary * 12));
                System.out.println("수정 완료!");
            } else if (menu == 3) {
                break;
            }
        }
        scanner.close();
    }
}