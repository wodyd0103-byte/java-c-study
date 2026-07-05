import java.util.ArrayList;
import java.util.Collections;       // 정렬을 위한 import

public class GenericDemo {
    public static void main(String[] args) {
        // === 정수 리스트:  (int의 래퍼 클래스) ===
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(90);              // int → Integer 자동 변환 (오토박싱)
        scores.add(85);
        scores.add(78);
        scores.add(92);

        // === 합계, 평균 계산 ===
        int total = 0;
        for (int score : scores) {   // Integer → int 자동 변환 (언박싱)
            total += score;
        }
        double avg = total / (double) scores.size();
        System.out.println("점수: " + scores);
        System.out.println("합계: " + total + " | 평균: " + avg);

        // === 정렬 ===
        Collections.sort(scores);    // 오름차순 정렬
        System.out.println("정렬: " + scores);

        // === 최대/최소 ===
        System.out.println("최대: " + Collections.max(scores));
        System.out.println("최소: " + Collections.min(scores));

        // === 타입 안전성: 컴파일 에러로 방지 ===
        // scores.add("문자열");     // 컴파일 에러! Integer만 가능
    }
}