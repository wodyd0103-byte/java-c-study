public class MethodBasic {
    //반환값 있는 매서드 : 두 수의 합 계산
    static int add (int a , int b){ //int 반환 , 매개변수 2개
        return a+b; //결과를 돌려줌
    }
    //void 매서드: 인사말 출력(반환값 없음)
    static void printHello(String name) {
        System.out.println("안녕하세요. "+name + "님!");
    }

    public static void main(String[] args) {
        int result = add(3,5);  //매서드 호출, 결과 저장
        System.out.println("3 + 5 =" +result);

        printHello("홍길동"); //void 매서드 호출
    }
}
