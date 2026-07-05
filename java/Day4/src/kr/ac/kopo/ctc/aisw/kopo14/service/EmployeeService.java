package kr.ac.kopo.ctc.aisw.kopo14.service;

import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;

public class EmployeeService {
    // --- 연봉 계산 ---
    public double getAnnualSalary(Employee emp) {
        return emp.getMonthlySalary() * 12;   // 월급 x 12
    }

    // --- 정보 출력 ---
    public void printInfo(Employee emp) {
        System.out.printf("[%s] %d세 | %s | 월급: %.0f만원 | 연봉: %.0f만원%n",
                emp.getName(), emp.getAge(), emp.getDepartment(), emp.getMonthlySalary(), getAnnualSalary(emp));
    }

}
