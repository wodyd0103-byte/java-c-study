class Duck extends Animal {
    Duck(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + "가 꽥꽥! 합니다.");    // Duck만의 구현
    }
}