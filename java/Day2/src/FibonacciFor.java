public class FibonacciFor {
    
    // 재귀 방식으로 n번째 피보나치 수 구하기
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    // 반복문 방식으로 n번째 피보나치 수 구하기
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        
        int first = 0;
        int second = 1;
        
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        
        return second;
    }
    
    // 반복문으로 피보나치 수열 출력
    public static void printFibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        
        System.out.println("피보나치 수열 (반복문): ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            
            // 다음 피보나치 수 계산
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n = 10; // 출력할 피보나치 수열의 길이
        
        System.out.println("========== 피보나치 수열: 재귀 vs 반복문 ==========\n");
        
        // 반복문으로 피보나치 수열 출력
        printFibonacciSeries(n);
        
        // 재귀 방식으로 n번째 피보나치 수 출력
        System.out.println("\n재귀 방식 - " + n + "번째 피보나치 수: " + fibonacciRecursive(n - 1));
        
        // 반복문 방식으로 n번째 피보나치 수 출력
        System.out.println("반복문 방식 - " + n + "번째 피보나치 수: " + fibonacciIterative(n - 1));
        
        // 비교: 0~15번째 피보나치 수
        System.out.println("\n========== 0~15번째 피보나치 수 비교 ==========");
        System.out.println("순번\t재귀\t\t반복문\t\t일치여부");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i <= 15; i++) {
            int recursiveResult = fibonacciRecursive(i);
            int iterativeResult = fibonacciIterative(i);
            boolean match = recursiveResult == iterativeResult;
            
            System.out.printf("%d\t%d\t\t%d\t\t%s\n", 
                            i, recursiveResult, iterativeResult, match ? "O" : "X");
        }
        
        System.out.println("\n========== 성능 비고 ==========");
        System.out.println("- 재귀 방식: 코드가 간단하지만 큰 수에서 성능이 느림");
        System.out.println("- 반복문 방식: 메모리 효율이 좋고 실행 속도가 빠름");
        System.out.println("- 두 방식 모두 동일한 결과를 반환함");
    }
}