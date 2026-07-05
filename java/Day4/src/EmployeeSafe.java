import javax.xml.transform.Source;

public class EmployeeSafe {
    // == 필드: 모두 private으로 보호 ==
    private  String name;  //외부에서 직접 접근 불가
    private  int age;
    private  String  department;

    // === 생성자 ===
    EmployeeSafe(String name, int age, String dept) {
        this.name = name;
        setAge(age);        //setter를 통해 검증
        this.department = dept;
    }

    // ===Getter:값 읽기 ===
    public String getName() { return name; }
    public int getAge() {return age; }

    // === setter: 값 변경(검증 포함) ===
    public void setAge(int age) {
        if (age <0 || age > 150) {
            System.out.println("잘못된 나이: "+age+"->무시됨");
            return;
        }
        this.age=age;
    }

    public void printInfo() {
        System.out.println(name+"("+age+"세) - "+department);
    }
}
