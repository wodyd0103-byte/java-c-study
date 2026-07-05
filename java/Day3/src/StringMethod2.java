public class StringMethod2 {
    public static void main(String[] args) {
        // split() 콤마로 쪼개기
        String csv = "홍길동,90,85,78";
        String[] parts = csv.split(",");
        System.out.println("이름: "+parts[0]);
        System.out.println("점수: "+parts[1]);

        //replace 바꾸기
        String msg = "Java is fun";
        String newMsg = msg.replace("fun","awesome");
        System.out.println(newMsg);

        //index0f 찾기
        System.out.println("위치: "+msg.indexOf("fun"));
        System.out.println("없음: "+msg.indexOf("Python"));
    }
}
