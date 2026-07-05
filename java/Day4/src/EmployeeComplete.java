public class EmployeeComplete {
    // === 필드: private으로 보호 ===
    private String name;
    private int age;
    private String department;
    private double salary;
    private static int totalCount = 0;   // 전체 직원 수 (공유)

    // === 생성자: 초기화 + 검증            ===
    public EmployeeComplete(String name, int age, String dept, double salary) {
        this.name = name;
        this.age = (age > 0) ? age : 0;
        this.department = dept;
        this.salary = (salary > 0) ? salary : 0;
        totalCount++;                    // 생성할 때마다 카운트 증가
    }

    // === Getter / Setter ===
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }

    // === static 메서드 ===
    public static int getTotalCount() {
        return totalCount;               // 전체 직원 수 반환
    }

    // === 일반 메서드 ===
    public void printInfo() {
        System.out.println("[" + name + "] " + age + "세 | "
                + department + " | 연봉: " + salary + "만원");
    }

    public static void main(String[] args) {
        EmployeeComplete e1 = new EmployeeComplete("김자바", 25, "개발팀", 4000);
        EmployeeComplete e2 = new EmployeeComplete("이파이썬", 30, "데이터팀", 4500);
        EmployeeComplete e3 = new EmployeeComplete("박스프링", 28, "백엔드팀", 5000);
        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
        System.out.println("총 직원 수: " + EmployeeComplete.getTotalCount());
    }
}
