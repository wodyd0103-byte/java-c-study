//public class ZooManager {
//    // === 다형성 활용: 모든 동물을 Animal로 받기 ===
//    static void feedAll(Animal[] animals) {
//        System.out.println("=== 전체 급식 시간 ===");
//        for (Animal a : animals) {
//            a.eat();                 // 각 동물에 맞게 실행
//        }
//    }
//
//    static void rollCall(Animal[] animals) {
//        System.out.println("=== 출석 체크 ===");
//        for (Animal a : animals) {
//            a.introduce();
//            a.sound();               // 다형성: 각자의 소리
//        }
//    }
//
//    static int countByType(Animal[] animals, String type) {
//        int count = 0;
//        for (Animal a : animals) {
//            if (type.equals("Dog") && a instanceof Dog) count++;
//            if (type.equals("Cat") && a instanceof Cat) count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Animal[] zoo = {
//                new Dog("바둑이",3,r),
//                new Cat("나비"),
//                new Dog("초코"),
//                new Cat("루시"),
//                new Duck("도널드")
//        };
//
//        rollCall(zoo);
//        System.out.println();
//        feedAll(zoo);
//        System.out.println();
//        System.out.println("강아지 수: " + countByType(zoo, "Dog"));
//        System.out.println("고양이 수: " + countByType(zoo, "Cat"));
//    }
//}