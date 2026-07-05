public class GradeProcessor {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 95, 60}; // 5명의 점수
        int sum = 0;                       // 합계 변수

        // 합계 계산 (향상된 for문)
        for (int score : scores) {         // 배열의 각 점수를 꺼냄
            sum += score;                  // 누적 합산
        }
        double avg = (double) sum / scores.length; // 평균 (실수 나눗셈)

        // 등급 판정 (if/else)
        String grade;
        if (avg >= 90) grade = "A";
        else if (avg >= 80) grade = "B";
        else if (avg >= 70) grade = "C";
        else grade = "D";

        // 결과 출력
        System.out.printf("합계: %d\n", sum);
        System.out.printf("평균: %.1f (%s등급)\n", avg, grade);
    }
}