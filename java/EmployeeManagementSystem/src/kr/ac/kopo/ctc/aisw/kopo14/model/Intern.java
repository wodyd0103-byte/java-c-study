package kr.ac.kopo.ctc.aisw.kopo14.model;

// === Intern.java — 인턴 (고정수당) ===
public class Intern extends Employee {
    private double stipend;                // 월 수당 (만원)

    public Intern(String name, int age, String dept, double stipend) {
        super(name, age, dept);
        this.stipend = stipend;
    }

    @Override
    public double calcSalary() { return stipend; }  // 고정 수당 반환

    @Override
    public String getType() { return "인턴"; }

    @Override
    public void print() {
        System.out.printf("[%s] %s | %s | %d세 | 수당:%.0f만%n",
                getType(), getName(), getDepartment(), getAge(), stipend);
    }
    public double getStipend() { return stipend;}
}