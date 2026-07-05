//public class InstanceofDemo {
//    public static void main(String[] args) {
//        Animal[] zoo = {
//                new Dog("바둑이"),
//                new Cat("나비"),
//                new Duck("도널드"),
//                new Dog("초코")
//        };
//
//        for (Animal animal : zoo) {
//            animal.sound();          // 다형성: 각자의 소리
//
//            // === instanceof로 실제 타입 확인 ===
//            if (animal instanceof Dog) {
//                Dog dog = (Dog) animal;   // 다운캐스팅
//                dog.bark();               // Dog만의 메서드!
//            } else if (animal instanceof Cat) {
//                Cat cat = (Cat) animal;
//                cat.purr();
//            }
//            System.out.println("---");
//        }
//    }
//}