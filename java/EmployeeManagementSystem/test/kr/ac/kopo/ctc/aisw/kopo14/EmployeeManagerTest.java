package kr.ac.kopo.ctc.aisw.kopo14;

import kr.ac.kopo.ctc.aisw.kopo14.app.EmployeeManager;
import kr.ac.kopo.ctc.aisw.kopo14.model.Employee;
import kr.ac.kopo.ctc.aisw.kopo14.model.FullTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {
    private EmployeeManager manager;

    @BeforeEach                      // 각 테스트 전에 실행
    void setUp() {
        manager = EmployeeManager.getInstance();
        manager.clear();             // 테스트 간 격리: 직원 목록 초기화
    }

    @Test
    void testAddEmployee() {
        Employee emp = new FullTime("테스트", 25, "개발팀", 4000);
        manager.addEmployee(emp);
        assertTrue(manager.getCount() > 0);  // 1명 이상 존재
    }

    @Test
    void testFindByName() {
        manager.addEmployee(new FullTime("김자바", 30, "개발팀", 5000));
        Employee found = manager.findByName("김자바");
        assertNotNull(found);                // 찾았는지 확인
        assertEquals("김자바", found.getName());
    }

    @Test
    void testFindByNameNotFound() {
        Employee found = manager.findByName("없는사람");
        assertNull(found);                   // null 반환 확인
    }

    @Test
    void testSingletonSameInstance() {
        EmployeeManager mgr1 = EmployeeManager.getInstance();
        EmployeeManager mgr2 = EmployeeManager.getInstance();
        assertSame(mgr1, mgr2);              // 같은 객체인지 확인
    }
}