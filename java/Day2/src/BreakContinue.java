public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== continue: 짝수 건너뛰기 ===");
        for (int i = 1; i <= 6; i++) {
            if(i%2==0) continue;
            System.out.println(i);
        }

        System.out.println("=== break: 5에서 탈출===");
        for (int i = 1; i<=10; i++) {
            if (i > 5) break;
            System.out.println(i);
        }
    }
}
