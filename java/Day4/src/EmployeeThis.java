public class EmployeeThis {
    String name;                     // 필드: 직원 이름
    int age;                         // 필드: 나이

    // === this를 사용한 생성자 (표준 관례) ===
    EmployeeThis(String name, int age) {
        this.name = name;            // this.name = 필드, name = 매개변수
        this.age = age;              // this.age = 필드, age = 매개변수
        System.out.println(this.name + " 생성 완료!");
    }

    // === this 없이 쓰면? (잘못된 예시) ===
    // EmployeeThis(String name, int age) {
    //     name = name;   // ← 매개변수 = 매개변수 (필드 변경 안 됨!)
    //     age = age;     // ← 같은 문제 발생
    // }

    void printInfo() {
        System.out.println("이름: " + this.name + ", 나이: " + this.age);
    }

    public static void main(String[] args) {
        EmployeeThis e = new EmployeeThis("김자바",26);
        e.printInfo();
    }

}
