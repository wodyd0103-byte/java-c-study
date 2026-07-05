package kr.ac.kopo.ctc.aisw.kopo14.service;

import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.EmployeeDao;

// EmployeeService 인터페이스
public interface EmployeeService {
    void setEmployeeDao(EmployeeDao employeeDao);
    double calcSalary(Employee emp);
    double getAnnualSalary(Employee emp);
    void printInfo(Employee emp);
}