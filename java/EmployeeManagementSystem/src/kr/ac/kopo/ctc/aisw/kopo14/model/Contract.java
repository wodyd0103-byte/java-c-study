package kr.ac.kopo.ctc.aisw.kopo14.model;

// === Contract.java — 계약직 (시급제) ===
public class Contract extends Employee {
    private double hourlyRate;             // 시급 (원)
    private int hoursWorked;               // 월 근무시간

    public Contract(String name, int age, String dept, double hourlyRate, int hoursWorked) {
        super(name, age, dept);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calcSalary() { return hourlyRate * hoursWorked / 10000; }

    @Override
    public String getType() { return "계약직"; }

    @Override
    public void print() {
        System.out.printf("[%s] %s | %s | %d세 | 시급:%.0f원 | 월급:%.0f만%n",
                getType(), getName(), getDepartment(), getAge(),
                hourlyRate, calcSalary());
    }
    public double getHourlyRate() { return hourlyRate;}
    public Integer getHoursWorked() { return hoursWorked;}
}