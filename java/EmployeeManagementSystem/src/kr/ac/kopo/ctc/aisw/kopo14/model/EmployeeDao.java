package kr.ac.kopo.ctc.aisw.kopo14.model;

import java.util.List;

// 1. EmployeeDao 인터페이스
public interface EmployeeDao {
    Employee create(Employee employee);
    Employee readOne(int id);
    List<Employee> readAll();
    Employee update(int id, Employee employee);
    Employee delete(int id);
    List<Employee> readList(int offset, int limit, String sortBy, String order);
}