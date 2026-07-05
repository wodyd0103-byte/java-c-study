public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+"번째 반복");
        }

        System.out.println("---");

        int[] nums = {10,20,30};
        for(int n : nums) {
            System.out.println("값 :" +n);
        }
    }
}
