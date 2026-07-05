import java.util.Scanner;

public class ArrayCalc {
    public static void main(String[] args) {
        int[] scores = {90,85,78,92,88};

        //합계
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        System.out.println("합계: "+sum);

        //평균
        double avg= (double) sum / scores.length;
        System.out.println("평균: "+ avg);

        //최대값
        int max = scores[0];
        for(int s : scores) {
            if (s > max) {
                max = s;
            }

        }
        System.out.println("최대값: "+max);
    }
}
