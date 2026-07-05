public class DiamondStarClaudeGlm {
    public static void main(String[] args) {
        int n = 5; // 다이아몬드의 중간 줄 (반쪽 높이)

        // 윗부분 (상단 삼각형)
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print("　");
            }
            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }

        // 아랫부분 (하단 역삼각형)
        for (int i = n - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print("　");
            }
            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
