package kr.ac.kopo.ctc.aisw.kopo14;

import kr.ac.kopo.ctc.aisw.kopo14.model.Contract;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;
import kr.ac.kopo.ctc.aisw.kopo14.model.Intern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testFullTimeSalary() {
        // Given: 연봉 5000만원 정규직 생성
        FullTime ft = new FullTime("김자바", 30, "개발팀", 5000);

        // When: 월급 계산
        double salary = ft.calcSalary();

        // Then: 5000 / 12 ≈ 416.67
        assertEquals(416.67, salary, 0.01);  // 오차 0.01 허용
    }

    @Test
    void testContractSalary() {
        Contract ct = new Contract("이파이썬", 28, "데이터팀", 25000, 160);
        assertEquals(400.0, ct.calcSalary(), 0.01);  // 25000*160/10000
    }

    @Test
    void testInternSalary() {
        Intern in = new Intern("정코틀린", 22, "개발팀", 180);
        assertEquals(180.0, in.calcSalary(), 0.01);  // 고정 수당
    }

    @Test
    void testEmployeeName() {
        FullTime ft = new FullTime("김자바", 30, "개발팀", 5000);
        assertEquals("김자바", ft.getName());       // 이름 확인
        assertEquals("개발팀", ft.getDepartment());  // 부서 확인
    }
}
