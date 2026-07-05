void main() {
    int size = 5; // 다이아몬드 크기 (위쪽 삼각형의 행 수)
    
    // 위쪽 삼각형 (1행 ~ size행)
    for (int i = 1; i <= size; i++) {
        // 선행 공백 출력
        for (int j = 1; j <= size - i; j++) {
            IO.print(" ");
        }
        
        // 별 출력
        for (int k = 1; k <= 2 * i - 1; k++) {
            IO.print("★");
        }
        
        IO.println();
    }
    
    // 아래쪽 삼각형 (size+1행 ~ 2*size-1행)
    for (int i = size + 1; i <= 2 * size - 1; i++) {
        // 선행 공백 출력
        for (int j = 1; j <= i - size; j++) {
            IO.print(" ");
        }
        
        // 별 출력
        for (int k = 1; k <= 2 * (2 * size - i) - 1; k++) {
            IO.print("★");
        }
        
        IO.println();
    }
}