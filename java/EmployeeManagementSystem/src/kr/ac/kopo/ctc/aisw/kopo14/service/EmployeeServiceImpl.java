package kr.ac.kopo.ctc.aisw.kopo14.service;

import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.EmployeeDao;

// EmployeeService 구현체
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    @Override
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public double calcSalary(Employee emp) {
        return emp.calcSalary();  // Employee 객체에 위임
    }

    @Override
    public double getAnnualSalary(Employee emp) {
        return emp.calcSalary() * 12;   // 월급 x 12
    }

    @Override
    public void printInfo(Employee emp) {
        System.out.printf("[%s] %d세 | %s | 월급: %.0f만원 | 연봉: %.0f만원%n",
                emp.getName(), emp.getAge(), emp.getDepartment(), calcSalary(emp), getAnnualSalary(emp));
    }
}