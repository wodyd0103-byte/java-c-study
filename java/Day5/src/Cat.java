class Cat extends Animal {
//    boolean isIndoor;                // Cat 만의 추가 필드
//
//    void purr() {                    // Cat 만의 추가 메서드
//        System.out.println(name + "가 그르르~ 합니다.");
//    }

    Cat(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + "가 야옹~ 합니다.");    // Cat 만의 구현
    }

}