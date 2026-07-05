class Animal {
    String name;                     // 이름 (모든 동물 공통)
    int age;                         // 나이 (모든 동물 공통)

    // 부모 생성자
    Animal(String name) {
        this.name = name;
        this.age = age;
        System.out.println("[Animal 생성자] " + name + " 탄생!");
    }
    void eat() {                     // 먹기 (모든 동물 공통)
        System.out.println(name + "가 밥을 먹습니다.");
    }
    void introduce() {
        System.out.println("[" + name + "] " + age + "살");
    }
    // 부모의 sound() — 기본 구현
    void sound() {
        System.out.println(name + "가 소리를 냅니다.");  // 일반적 표현
    }
}