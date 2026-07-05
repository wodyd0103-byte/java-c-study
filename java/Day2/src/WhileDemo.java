public class WhileDemo {
    public static void main(String[] args) {
        // while 조건 먼저 검사
        int count = 0;
        while (count<3) {  // 조건이 참인 동안만 반복
            System.out.println("while: " + count);
            count++; //증가 시키기 안 시키면 무한 루프
        }

        System.out.println("---");
        // do-while 최소 1번 실행 보장
        int num=5;
        do {
            System.out.println("do-while: "+num);
            num--;  //감소
        } while (num>5); // 조건이 거짓이어도 1번은 실행
    }
}
