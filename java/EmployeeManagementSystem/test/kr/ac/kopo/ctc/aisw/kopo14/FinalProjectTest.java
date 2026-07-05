package kr.ac.kopo.ctc.aisw.kopo14;

import kr.ac.kopo.ctc.aisw.kopo14.app.*;
import kr.ac.kopo.ctc.aisw.kopo14.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinalProjectTest {

    // === 테스트 1: 급여 계산 검증 ===
    @Test
    void testSalaryCalculation() {
        assertEquals(416.67, new FullTime("A", 30, "팀", 5000).calcSalary(), 0.01);
        assertEquals(400.0, new Contract("B", 28, "팀", 25000, 160).calcSalary(), 0.01);
        assertEquals(180.0, new Intern("C", 22, "팀", 180).calcSalary(), 0.01);
    }

    // === 테스트 2: 팩토리 검증 ===
    @Test
    void testFactoryCreation() {
        Employee ft = EmployeeFactory.create("FULL", "테스트", 25, "팀", 4000);
        assertTrue(ft instanceof FullTime);       // FullTime 타입인지

        Employee in = EmployeeFactory.create("INTERN", "테스트", 20, "팀", 150);
        assertTrue(in instanceof Intern);          // Intern 타입인지

        assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.create("UNKNOWN", "테스트", 25, "팀", 0);
        });                                        // 잘못된 타입 → 예외
    }

    // === 테스트 3: 싱글톤 + CRUD 검증 ===
    @Test
    void testSingletonAndCRUD() {
        EmployeeManagerV3 mgr1 = EmployeeManagerV3.getInstance();
        EmployeeManagerV3 mgr2 = EmployeeManagerV3.getInstance();
        assertSame(mgr1, mgr2);                   // 같은 객체

        Employee emp = EmployeeFactory.create("FULL", "JUnit테스트", 25, "개발팀", 4000);
        mgr1.add(emp);
        assertNotNull(mgr2.findByName("JUnit테스트"));  // mgr2에서도 찾기 가능
    }
}

