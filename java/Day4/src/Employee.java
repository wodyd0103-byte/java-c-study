public class Employee {
    String name;                     // 직원 이름
    int age;                         // 나이
    String department;               // 부서

    // === 기본 생성자: 매개변수 없음 ===
    Employee() {
        name = "미정";               // 기본값 설정
        age = 0;
        department = "미배정";
        System.out.println("[기본 생성자] 직원 생성됨");
    }

    // === 매개변수 생성자: 값을 받아서 초기화 ===
    Employee(String n, int a, String dept) {
        name = n;                    // 전달받은 값으로 초기화
        age = a;
        department = dept;
        System.out.println("[매개변수 생성자] " + name + " 생성됨");
    }

    void printInfo() {
        System.out.println(name + " (" + age + "세) - " + department);
    }
}
