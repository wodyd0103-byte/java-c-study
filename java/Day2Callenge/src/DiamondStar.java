public class DiamondStar {
    public static void main(String[] args) {
        int size = 5;

        // 상단 삼각형
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("　");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }

        // 하단 역삼각형
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("　");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
