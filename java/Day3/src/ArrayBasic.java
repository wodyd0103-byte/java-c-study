public class ArrayBasic {
    public static void main(String[] args) {
        // 방법 1 선언 후 생성
        int [] scores = new int[5]; // 정수 5칸 배열 생성
        scores[0] = 90;  // 0번칸 90 저장
        scores[1] = 85;  // 1번칸 85 저장

        // 방법 2 선언과 동시에 초기화

        int[] grades = {90,85,78,92,88}; // 5개 값으로 초기화

        System.out.println("score[0] = "+scores[0]); //score 0번칸 출력
        System.out.println("grades 길이 = "+grades.length); // grades 배열 길이
    }
}
