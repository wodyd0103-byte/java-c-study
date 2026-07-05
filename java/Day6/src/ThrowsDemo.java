import java.security.spec.RSAOtherPrimeInfo;

public class ThrowsDemo {
    // == throws: 예외를 호출자에게 전파 ==
    static int divide(int a, int b) throws  ArithmeticException {
        if (b==0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다!");
        }
        return a/b;
    }

    // == throw: 검증 실패 시 직접 예외 발생 ==

    static void  setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("나이가 올바르지 않음: " + age);
        }
        System.out.println("나이 설정: " + age);
    }

    public static void main(String[] args) {
        try {
            System.out.println("10/2=" + divide(10,2));
            System.out.println("10/0=" + divide(10,0));
        } catch (ArithmeticException e) {
            System.out.println("에러: "+ e.getMessage());
        }

        try {
            setAge(25);
            setAge(-5);
            setAge(150);
        } catch (IllegalArgumentException e) {
            System.out.println("에러: "+ e.getMessage());
        }
    }
}
