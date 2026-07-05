public class EmployeeSafeMain {
    public static void main(String[] args) {
        EmployeeSafe emp = new EmployeeSafe("김자바",25,"개발팀");
        emp.printInfo();
        emp.setAge(30);

        System.out.println(emp.getAge());
    }
}
