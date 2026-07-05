package kr.ac.kopo.ctc.aisw.kopo14;

import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.EmployeeDao;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;

import java.util.ArrayList;
import java.util.List;

// 테스트용 Mock DAO - 실제 DB 없이 가짜 데이터를 반환
public class EmployeeDaoMock implements EmployeeDao {

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee readOne(int id) {
        // id=1이면 연봉 5000만원인 정규직 직원 반환 → 월급 = 5000/12 = 416.67
        if (id == 1) {
            FullTime employee = new FullTime("테스트직원", 30, "개발팀", 5000);
            employee.setId(1);
            return employee;
        }
        return null;
    }

    @Override
    public List<Employee> readAll() {
        return new ArrayList<>();
    }

    @Override
    public Employee update(int id, Employee employee) {
        return null;
    }

    @Override
    public Employee delete(int id) {
        return null;
    }

    @Override
    public List<Employee> readList(int offset, int limit, String sortBy, String order) {
        return new ArrayList<>();
    }
}