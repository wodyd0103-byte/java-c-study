public class MemoryTrace {
    public static void main(String[] args) {
        // === 객체 3개 생성: 각각 독립적인 Heap 공간 ===
        Dog dog1 = new Dog();        // Heap에 Dog 객체 #1 생성
        dog1.name = "바둑이";
        dog1.age = 3;

        Dog dog2 = new Dog();        // Heap에 Dog 객체 #2 생성
        dog2.name = "초코";
        dog2.age = 5;

        Dog dog3 = new Dog();        // Heap에 Dog 객체 #3 생성
        dog3.name = "뽀삐";
        dog3.age = 1;

        // === 각 객체의 메서드 호출 ===
        dog1.introduce();            // 각자의 데이터 출력
        dog2.introduce();
        dog3.introduce();

        // === 참조 복사 실험 ===
        Dog copy = dog1;             // copy도 dog1과 같은 객체를 가리킴!
        copy.name = "흰둥이";         // copy로 이름 변경
        System.out.println("\n[참조 복사 후]");
        System.out.println("dog1.name: " + dog1.name);  // 흰둥이!
        System.out.println("copy.name: " + copy.name);  // 흰둥이!
        System.out.println("같은 객체? " + (dog1 == copy)); // true
    }
}
