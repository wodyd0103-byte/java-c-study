public class ObjectOne {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.name = "바둑이";
        // Stack: [a] → Heap: [Dog{name="바둑이"}]
        // 메모리: Stack 1개, Heap 1개

        // 참조변수 출력 → 객체의 주소가 나옴
        System.out.println("a 참조: " + a);
        System.out.println("a.name: " + a.name);

    }
}
