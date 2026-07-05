public class OverloadDemo {
    // 정수 2개 더하기
    static int add(int a, int b) {
        return a+b;
    }

    //정수 3개 더하기
    static int add(int a, int b, int c){
        return a+b+c;
    }

    // 실수 2개 더하기
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(1,2,3));
        System.out.println(add(1.5,2.5));
    }
}
