import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요: ");
        double celsius = sc.nextDouble();            // 섭씨 온도 입력

        // 변환 공식: F = C × 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32;  // 9.0/5.0 주의!

        System.out.printf("섭씨 %.1f°C = 화씨 %.1f°F%n", celsius, fahrenheit);
        sc.close();
    }
}