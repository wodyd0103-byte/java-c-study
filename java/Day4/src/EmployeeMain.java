public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();                    // 기본 생성자
        Employee e2 = new Employee("김자바", 25, "개발팀");  // 매개변수 생성자

        e1.printInfo();
        e2.printInfo();
    }
}
