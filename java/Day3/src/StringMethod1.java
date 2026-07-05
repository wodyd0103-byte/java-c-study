public class StringMethod1 {
    public static void  main (String[] args){
        String msg ="Hello, Java!";

        //length()글자 수
        System.out.println("길이: "+msg.length());

        //charAt() 특정 글자 위치
        System.out.println("첫글자: "+msg.charAt(0));
        System.out.println("마지막글자: "+msg.charAt(msg.length()-1));

        //substring() 부분 문자열
        System.out.println("잘라내기: " + msg.substring(7,11));
    }
}
