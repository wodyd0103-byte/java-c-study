public class FibonacciClaudeGlm {
    public static void main(String[] args) {

        // 피보나치 수열이란?
        // 앞의 두 수를 더해서 다음 수를 만드는 수열
        // 예: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        //     0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8 ...

        int n = 10;        // 출력할 피보나치 수열의 개수

        int first = 0;     // 첫 번째 항 (F(0) = 0)
        int second = 1;    // 두 번째 항 (F(1) = 1)

        System.out.println("피보나치 수열 (반복문, " + n + "개):");

        // for문으로 n번 반복하면서 피보나치 수열 출력
        for (int i = 0; i < n; i++) {

            // 현재 항(first) 출력
            System.out.print(first + " ");

            // 다음 항 계산: 앞의 두 수를 더함
            int next = first + second;

            // 다음 반복을 위해 변수값 이동
            // first ← second (두 번째 수가 첫 번째 자리로)
            // second ← next  (새로 구한 수가 두 번째 자리로)
            first = second;
            second = next;
        }

        System.out.println();
    }
}
