public class Person {
    // === 필드: 사람의 속성 ===
    String name;                     // 이름
    int age;                         // 나이
    double height;                   // 키 (cm)
    String job;                      // 직업

    // === 메서드: 자기소개 ===
    void introduce() {
        System.out.println("=== 자기소개 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");
        System.out.println("직업: " + job);
    }
}
