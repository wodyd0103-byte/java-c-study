public class OverrideDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이");
        Cat cat = new Cat("나비");
        Duck duck = new Duck("도널드");

        // 같은 sound() 메서드지만 각자 다른 결과!
        dog.sound();                 // 멍멍!
        cat.sound();                 // 야옹~
        duck.sound();                // 꽥꽥!
    }
}