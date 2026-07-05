public class Factorial {
    static int factorial(int n) {
        if (n <= 1 ) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("3! = " + factorial(3));
        System.out.println("1! = " + factorial(1));


        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        System.out.println("반복 5! = " + result);
    }
}
