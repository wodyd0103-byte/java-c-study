public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();    // 첫 번째 사람 생성
        p1.name = "김자바";
        p1.age = 25;
        p1.height = 175.5;
        p1.job = "개발자";
        p1.introduce();              // p1의 자기소개

        System.out.println();        // 빈 줄

        Person p2 = new Person();    // 두 번째 사람 생성
        p2.name = "이파이썬";
        p2.age = 22;
        p2.height = 162.0;
        p2.job = "디자이너";
        p2.introduce();              // p2의 자기소개
    }
}
