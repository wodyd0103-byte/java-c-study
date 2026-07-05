public class StudentMain {
    public static void main(String[] args) {
    Student s = new Student();   // 학생 객체 생성
    s.name = "홍길동";
    s.kor = 90;
    s.eng = 85;
    s.math = 78;
    s.printReport();             // 성적표 출력
}
}
