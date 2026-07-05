public class TryCatchDemo {
    public static void main(String[] args) {
        // === 예외 없는 경우 ===
        try {
            int result = 10 / 2;     // 정상 실행
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("에러: " + e.getMessage());
        }

        // === 예외 발생! ===
        try {
            int result = 10 / 0;     // 0으로 나누기 → 예외!
            System.out.println("이 줄은 실행 안 됨");
        } catch (ArithmeticException e) {
            System.out.println("에러 잡음: " + e.getMessage());
        }

        System.out.println("프로그램 계속 실행 중!");
    }
}