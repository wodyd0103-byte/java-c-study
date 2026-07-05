    /**
 * 다이아몬드 별찍기 프로그램
 * ★ 문자를 사용하여 10 줄 대칭 다이아몬드 출력
 */
public class Diamond {
    public static void main(String[] args) {
        IO.println("=== 10 줄 대칭 다이아몬드 별찍기 (★) ===\n");
        printDiamond(10);
    }
    
    /**
     * 다이아몬드 모양을 출력하는 메서드
     * @param lines 출력할 줄 수 (짝수)
     */
    public static void printDiamond(int lines) {
        if (lines % 2 != 0) {
            IO.println("줄 수는 짝수여야 합니다.");
            return;
        }
        
        int half = lines / 2;
        
        // 상반부 출력 (1 ~ half 줄)
        for (int i = 1; i <= half; i++) {
            printLine(i, half);
        }
        
        // 중간 줄 출력 (2 줄)
        printMaxLine(half + 1);
        printMaxLine(half + 1);
        
        // 하반부 출력 (half + 2 ~ lines 줄)
        for (int i = half; i >= 1; i--) {
            printLine(i, half);
        }
    }
    
    /**
     * 각 줄을 출력하는 메서드 (공백 폭 조정)
     * ★ 문자의 폭을 고려하여 공백을 2 배로 출력
     * @param line 현재 줄 번호
     * @param max 최대 줄 번호
     */
    public static void printLine(int line, int max) {
        // 공백: ★ 폭을 고려하여 2 배 출력
        for (int j = 0; j < 2 * (max - line + 1); j++) {
            IO.print(" ");
        }
        // 별 출력
        for (int j = 0; j < 2 * line - 1; j++) {
            IO.print("★");
        }
        IO.println();
    }
    
    /**
     * 최대 별 개수를 출력하는 메서드
     * @param max 최대 줄 번호
     */
    public static void printMaxLine(int max) {
        // 최대 별 개수 출력
        for (int j = 0; j < 2 * max + 1; j++) {
            IO.print("★");
        }
        IO.println();
    }
}