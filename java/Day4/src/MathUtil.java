public class MathUtil {
    static int add(int a,int b) {
        return a+b;
    }

    static int max(int a, int b) {
        return (a>b) ? a:b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int sum = MathUtil.add(10, 20);
        int bigger = MathUtil.max(15, 8);
        boolean even = MathUtil.isEven(4);

        System.out.println("10+20= " + sum);
        System.out.println(" 15 와 8중 큰수: " +bigger);
        System.out.println("4는 짝수? "+even);

        System.out.println("7+3=" +add(7,3));
    }
}
