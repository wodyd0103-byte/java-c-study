public class MemoryDemo2 {
    // static int count = 0;  // 스태틱 영역에 저장

    public static void main(String[] args) { // 스태틱에 메인 프레임 새엇ㅇ
        //int age = 25;  //스택 영역에 저장
        //String name = "홍길동"; //힙 문자열 객체 생성
        //count++;  //스태틱 영역과 값 변경

        //System.out.println(name+"님"+age+"세");
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);
        System.out.println(s2.equals(s3));
    }
}
