public class Dog {
    // == 필드(속성): 강아지가 가진 데이터 ===
    String name; //이름
    String breed; //품종
    int age; //나이

    // ===매서드(행동): 강아지가 할 수 있는것 ===
    void bark() { //짖기 기능
        System.out.println(name+"가 멍멍! 짖습니다.");
    }

    void introduce() {
        System.out.println("이름: "+ name + ", 품종: "+breed+ ", 나이: "+age+"살");
    }
}
