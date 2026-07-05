package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.*;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        EmployeeManagerV3 mgr = EmployeeManagerV3.getInstance();

        // === 1. CSV에서 기존 데이터 불러오기 ===
        mgr.loadFromCSV("team.csv");
        System.out.println("기존 데이터 로드 완료!\n");

        // === 2. 팩토리로 새 직원 추가 ===
        mgr.add(EmployeeFactory.create("FULL", "신입자바", 24, "개발팀", 3600));
        mgr.add(EmployeeFactory.create("INTERN", "실습생A", 20, "교육팀", 150));

        // === 3. 전체 출력 ===
        mgr.printAll();

        // === 4. 검색 ===
        System.out.println("\n--- 검색: 김자바 ---");
        Employee found = mgr.findByName("김자바");
        if (found != null) {
            found.print();
            System.out.printf("월급: %.0f만원%n", found.calcSalary());
        } else {
            System.out.println("찾을 수 없습니다.");
        }

        // === 5. 싱글톤 검증 ===
        EmployeeManagerV3 mgr2 = EmployeeManagerV3.getInstance();
        System.out.println("\n싱글톤 확인: " + (mgr == mgr2));  // true
        System.out.println("mgr2 직원 수: " + mgr2.getCount());
    }
}
