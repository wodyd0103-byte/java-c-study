package kr.ac.kopo.ctc.aisw.kopo14.model;

// === Employee.java — 추상 부모 클래스 ===
interface Printable {
    void print();
}

public abstract class Employee implements Printable {
    private String name;
    private int age;
    private String department;
    private static int totalCount = 0;

    Employee(String name, int age, String department) {

    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public static int getTotalCount() { return totalCount; }

    public abstract double calcSalary();          // 자식마다 다르게 구현
    public String getType() { return "직원"; }

    public double getMonthlySalary() {
        return 0;
    }
}

