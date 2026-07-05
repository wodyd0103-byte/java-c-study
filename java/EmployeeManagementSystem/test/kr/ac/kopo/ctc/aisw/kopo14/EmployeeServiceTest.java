package kr.ac.kopo.ctc.aisw.kopo14;

import kr.ac.kopo.ctc.aisw.kopo14.model.Contract;
import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.EmployeeDao;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    //private EmployeeDao employeeDao = new EmployeeDaoImpl();
    private EmployeeDao employeeDao = new EmployeeDaoMock();
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @BeforeEach
    void setUp() {
        employeeService.setEmployeeDao(employeeDao);
    }

    @Test
    void testCalcSalary() {
        // Given: Mock DAO에서 id=1인 직원 조회 (연봉 5000만원 정규직)
        Employee employee = employeeDao.readOne(1);

        // When: Service를 통해 월급 계산
        double salary = employeeService.calcSalary(employee);

        // Then: 5000 / 12 = 416.666... ≈ 416.67
        assertEquals(416.67, salary, 0.01);
    }

    @Test
    void testGetAnnualSalary() {
        // Given: Mock DAO에서 id=1인 직원 조회
        Employee employee = employeeDao.readOne(1);

        // When: 연봉 계산
        double annualSalary = employeeService.getAnnualSalary(employee);

        // Then: 416.67 * 12 = 5000.04 (오차 허용)
        assertEquals(5000.0, annualSalary, 0.1);
    }

    @Test
    void testCalcSalaryWithContract() {
        // Given: 계약직 직원 (시급 25000, 월 160시간)
        Contract contract = new Contract("박파이썬", 28, "데이터팀", 25000, 160);

        // When: Service를 통해 월급 계산
        double salary = employeeService.calcSalary(contract);

        // Then: 25000 * 160 / 10000 = 400.0
        assertEquals(400.0, salary, 0.01);
    }

    @Test
    void testReadOneMockReturnsCorrectId() {
        // Given: Mock DAO에서 id=1 조회
        Employee employee = employeeDao.readOne(1);

        // Then: id가 1인지 확인
        assertNotNull(employee);
        assertEquals(1, employee.getId());
    }
}