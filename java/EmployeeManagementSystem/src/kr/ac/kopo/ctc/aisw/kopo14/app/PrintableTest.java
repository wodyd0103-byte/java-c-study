package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.*;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;

public class PrintableTest {
    // === Printable 인터페이스로 다양한 객체 출력 ===
    static void printItems(Printable[] items) {
        for (Printable item : items) {
            item.print();             // 모든 Printable 객체 출력
        }
    }

    public static void main(String[] args) {
        // 직원 객체들 (모두 Printable 구현)
        Printable[] items = {
                new FullTime("김자바", 30, "개발팀", 5000),
                new Contract("박파이썬", 28, "데이터팀", 25000, 160),
                new Intern("정코틀린", 22, "개발팀", 180),
                new FullTime("전재용", 26, "개발팀", 4500)
        };

        System.out.println("=== Printable 인터페이스 테스트 ===");
        printItems(items);

        System.out.println("\n=== 개별 타입 확인 (instanceof) ===");
        for (Printable item : items) {
            if (item instanceof FullTime) {
                System.out.println(((Employee)item).getName() + " → 정규직");
            } else if (item instanceof Contract) {
                System.out.println(((Employee)item).getName() + " → 계약직");
            } else if (item instanceof Intern) {
                System.out.println(((Employee)item).getName() + " → 인턴");
            }
        }

        // Day 6 예고: Exportable 인터페이스 추가 → CSV 파일 저장
        System.out.println("\n[Day 6 예고] 여기에 CSV 내보내기 기능이 추가됩니다!");
    }
}
