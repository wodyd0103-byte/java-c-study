public class MemoryDemo {
    static int count = 0;  // 스태틱 영역에 저장

    public static void main(String[] args) { // 스태틱에 메인 프레임 새엇ㅇ
        int age = 25;  //스택 영역에 저장
        String name = "홍길동"; //힙 문자열 객체 생성
        count++;  //스태틱 영역과 값 변경

        System.out.println(name+"님"+age+"세");
    }
}
