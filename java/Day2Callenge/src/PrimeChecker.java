public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("1~100 사이의 소수:");

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
