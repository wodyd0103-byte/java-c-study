public class MemoryDemo {
    public static void main(String[] args) {
        // 1단계: 참조변수 선언 (Stack에 myDog 생성, 아직 null)
        Dog myDog;

        // 2단계: 객체 생성 + 참조 연결 (Heap에 Dog 생성)
        myDog = new Dog();           // Stack의 myDog → Heap의 Dog 객체

        // 3단계: 참조를 통해 객체 사용
        myDog.name = "바둑이";        // Heap 객체의 name 필드 변경
        myDog.age = 3;               // Heap 객체의 age 필드 변경

        // 참조변수 출력 → 객체의 주소가 나옴
        System.out.println("myDog 참조: " + myDog);
        System.out.println("myDog.name: " + myDog.name);

        // null 참조 시연 (주의!)
        Dog ghost = null;            // 아무것도 안 가리킴
        System.out.println("ghost: " + ghost);
        // ghost.name; ← 이렇게 하면 NullPointerException!
    }
}
