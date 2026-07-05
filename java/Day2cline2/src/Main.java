//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA 이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    IO.println(String.format("Hello and welcome!"));

    // 피보나치 수열 구현
    int n = 10;
    
    IO.println("=== 피보나치 수열 (반복 방식) ===");
    IO.println(n + " 번째 항까지 출력:");
    printFibonacci(n);
    
    IO.println("\n" + n + " 번째 피보나치 수: " + getFibonacci(n));
}

/**
 * N 번째 항까지 피보나치 수열을 모두 출력하는 메서드
 * @param n 출력할 항의 개수
 */
public static void printFibonacci(int n) {
    if (n <= 0) {
        IO.println("잘못된 입력입니다.");
        return;
    }
    
    if (n == 1) {
        IO.println(0);
        return;
    }
    
    int prev = 0;  // F(0)
    int curr = 1;  // F(1)
    
    // 첫 번째 항 출력
    IO.println(prev);
    
    // 두 번째 항부터 n 번째 항까지 출력
    for (int i = 2; i <= n; i++) {
        IO.println(curr);
        int next = prev + curr;
        prev = curr;
        curr = next;
    }
}

/**
 * N 번째 피보나치 수를 계산하는 메서드
 * @param n 계산할 항의 번호 (1 부터 시작)
 * @return N 번째 피보나치 수
 */
public static int getFibonacci(int n) {
    if (n <= 0) {
        return 0;
    }
    
    if (n == 1) {
        return 0;
    }
    
    if (n == 2) {
        return 1;
    }
    
    int prev = 0;  // F(0)
    int curr = 1;  // F(1)
    
    // 3 번째 항부터 n 번째 항까지 계산
    for (int i = 3; i <= n; i++) {
        int next = prev + curr;
        prev = curr;
        curr = next;
    }
    
    return curr;
}
