import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1에서 100 사이의 정수를 입력하세요: ");

        if (!scanner.hasNextInt()) {
            System.out.println("정수만 입력해주세요.");
            return;
        }

        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("입력 범위를 벗어났습니다. 1~100 사이의 수를 입력하세요.");
            return;
        }

        if (isPrime(n)) {
            System.out.println(n + "은(는) 소수입니다.");
        } else {
            System.out.println(n + "은(는) 소수가 아닙니다.");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}