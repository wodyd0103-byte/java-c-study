class Dog extends Animal {
    String breed;                    // Dog 만의 추가 필드

//    // 자식 생성자: super() 로 부모 생성자 먼저 호출
//    Dog(String name, int age, String breed) {
//        super(name);            // 반드시 첫 줄! 부모 생성자 호출
//        this.breed = breed;          // Dog 만의 필드 초기화
//        System.out.println("[Dog 생성자] 품종: " + breed);
//    }

    void bark() {// Dog 만의 추가 메서드
        super.eat();                 // 부모의 eat() 먼저 실행
        System.out.println(name + "가 멍멍! 짖습니다.");
    }
    Dog(String name) { super(name); }
    @Override                        // 오버라이딩 표시 (선택이지만 권장!)
    void sound() {                   // 부모와 같은 이름, 같은 매개변수
        System.out.println(name + "가 멍멍! 짖습니다.");  // Dog 만의 구현
    }
}