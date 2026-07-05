public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {      // 외부 루프: 5줄
            for (int j = 1; j <= i; j++) {  // 내부 루프: i개 별 출력
                System.out.print("★");
            }
            System.out.println();           // 줄바꿈
        }
    }
}