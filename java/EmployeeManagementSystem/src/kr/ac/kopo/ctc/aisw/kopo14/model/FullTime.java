package kr.ac.kopo.ctc.aisw.kopo14.model;

// === FullTime.java — 정규직 (연봉제) ===
public class FullTime extends Employee {
    public double annualSalary;           // 연봉 (만원)

    public FullTime(String name, int age, String dept, double annualSalary) {
        super(name, age, dept);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calcSalary() { return annualSalary / 12; }  // 월급 = 연봉/12

    @Override
    public String getType() { return "정규직"; }

    @Override
    public void print() {
        System.out.printf("[%s] %s | %s | %d세 | 연봉:%.0f만 | 월급:%.0f만%n",
                getType(), getName(), getDepartment(), getAge(),
                annualSalary, calcSalary());
    }
    public double getAnnualSalary() {return annualSalary;}
}

