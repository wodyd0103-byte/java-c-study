import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키(cm): ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;

        System.out.print("몸무게(kg): ");
        double weight = sc.nextDouble();

        double bmi = weight / (heightM * heightM);

        System.out.printf("BMI: %.1f → ", bmi);
        if (bmi < 18.5) System.out.println("저체중");
        else if (bmi < 25.0) System.out.println("정상");
        else if (bmi < 30.0) System.out.println("과체중");
        else System.out.println("비만");

        sc.close();
    }
}