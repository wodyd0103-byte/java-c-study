package kr.ac.kopo.ctc.aisw.kopo14.model;

public abstract class Employee implements Printable {
    private int id;
    private String name;
    private int age;
    private String department;
    private static int totalCount = 0;

    protected Employee(String name, int age, String department) {
        this.id = totalCount + 1;   // auto-increment (기존 버그: this.id = id)
        this.name = name;
        this.age = (age > 0) ? age : 0;  // 음수 검증: 0으로 보정
        this.department = department;
        totalCount++;
    }
    public int getId() {return id;}
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public static int getTotalCount() { return totalCount; }
    public abstract double calcSalary(); // 자식마다 다르게 구현
    public String getType() { return "직원"; }

}

//    // --- Getter ---
//    public String getName() { return name; }
//    public int getAge() { return age; }
//    public String getDepartment() { return department; }
//    public double getMonthlySalary() { return monthlySalary; }
//    public int getTotalCount() {return totalCount; }
//    // --- Setter (검증 포함) ---
//    public void setMonthlySalary(double salary) {
//        if (salary > 0) this.monthlySalary = salary;
//        else System.out.println("월급은 0보다 커야 합니다.");
//    }

