public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("피보나치 수열: ");
        
        int n = 8; // 출력할 피보나치 수열의 길이
        int first = 0;  // 첫 번째 숫자
        int second = 1; // 두 번째 숫자
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            
            // 다음 피보나치 수 계산
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
