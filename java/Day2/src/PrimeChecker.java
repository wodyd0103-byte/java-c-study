public class PrimeChecker {
    
    // 소수 판별 메소드
    public static boolean isPrime(int num) {
        // 1 이하는 소수가 아님
        if (num <= 1) {
            return false;
        }
        
        // 2는 소수
        if (num == 2) {
            return true;
        }
        
        // 짝수는 소수가 아님 (2 제외)
        if (num % 2 == 0) {
            return false;
        }
        
        // 3부터 sqrt(num)까지 홀수만 검사
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        
        System.out.println("========== " + start + "~" + end + " 사이의 소수 찾기 ==========\n");
        
        System.out.print("소수 목록: ");
        int count = 0;
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        System.out.println("\n\n총 소수 개수: " + count + "개");
        
        // 소수와 비소수 분류 출력
        System.out.println("\n========== 1~20까지의 숫자 분류 ==========");
        System.out.println("순번\t숫자\t소수여부\t\t약수");
        System.out.println("----------------------------------------------");
        
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + "\t" + i + "\t" + (isPrime(i) ? "소수" : "비소수") + "\t\t");
            
            // 약수 출력
            if (isPrime(i)) {
                System.out.println("1, " + i);
            } else {
                System.out.print("1");
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(", " + j);
                    }
                }
                System.out.println(", " + i);
            }
        }
        
        System.out.println("\n========== 소수의 정의 ==========");
        System.out.println("- 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수");
        System.out.println("- 예: 2, 3, 5, 7, 11, 13, 17, 19, ...");
        System.out.println("- 1은 소수가 아님");
    }
}