public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int first = 1;
        int second = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(first);
            if (i < count) {
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
