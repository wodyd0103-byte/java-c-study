import java.util.Scanner;

public class MultiCatchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        try {
            System.out.print("숫자 입력: ");
            String input = "abc";  // 테스트중 잘못 입력
            int num = Integer.parseInt(input); // NumberFormatException!

            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);


            int result = 10 / num;

        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("산술 에러: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 에러: "+ e.getMessage());
        } finally {
            System.out.println("[finally] 정리 작업 실행");
            sc.close();
        }
    }
}
