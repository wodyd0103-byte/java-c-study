package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.*;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;
import java.util.Scanner;

public class SafeInput {
    // === 안전한 정수 입력 (예외 처리 포함) ===
    static int getIntInput(Scanner sc, String prompt) {
        while (true) {               // 올바른 입력이 올 때까지 반복
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요!");
            }
        }
    }

    // === 안전한 실수 입력 ===
    static double getDoubleInput(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("올바른 숫자를 입력해주세요!");
            }
        }
    }

    // === 범위 검증 포함 정수 입력 ===
    static int getIntInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            int value = getIntInput(sc, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println(min + "~" + max + " 사이의 값을 입력해주세요!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "테스트직원";
        int age = getIntInRange(sc, "나이 (0~150): ", 0, 150);
        double salary = getDoubleInput(sc, "월급 (만원): ");

        System.out.println("\n입력 완료!");
        System.out.println(name + " | " + age + "세 | 월급 " + salary + "만원");

        sc.close();
    }
}

