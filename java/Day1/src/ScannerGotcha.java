import java.util.Scanner;
public class ScannerGotcha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        int age = sc.nextInt(); // 숫자만 입력받기 엔터는 넘김
        sc.nextLine(); //남은 엔터 제거
        System.out.print("이름: ");
        String name = sc.nextLine(); //이제 정상적으로 입력 가능

        System.out.println(name+"님,"+age+"세입니다.");
        sc.close();
    }
}
