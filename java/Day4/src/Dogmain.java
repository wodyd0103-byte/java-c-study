public class Dogmain {
    // == main: 프로그램 시작점 ===
    public  static void main(String[] args) {
        Dog myDog = new Dog();  //객체 생성(설계도->실물)
        myDog.name="바둑이";     //필드에 값 저장
        myDog.breed="진돗개";
        myDog.age=3;

        myDog.introduce();  //매서드 호춣
        myDog.bark();
    }
}
