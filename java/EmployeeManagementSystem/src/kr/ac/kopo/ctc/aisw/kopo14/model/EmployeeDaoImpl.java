package kr.ac.kopo.ctc.aisw.kopo14.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// EmployeeDaoImpl 구현체
public class EmployeeDaoImpl implements EmployeeDao {
    // 데이터를 저장할 실제 바구니
    private List<Employee> employees = new ArrayList<>();

    // 기본 생성자: 객체 생성 시 초기 더미 데이터를 리스트에 추가합니다.
    public EmployeeDaoImpl() {
        // 이름, 나이, 부서, 연봉 순으로 데이터 초기화 (FullTime 사용)
        employees.add(new FullTime("김자바", 30, "개발팀", 5004));   // 월급 417만 × 12
        employees.add(new FullTime("이파이썬", 28, "데이터팀", 4800)); // 월급 400만 × 12
        employees.add(new FullTime("박스프링", 35, "백엔드팀", 4800)); // 월급 400만 × 12
    }

    @Override
    public Employee create(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee readOne(int id) {
        // id가 일치하는 첫 번째 요소를 반환
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Employee> readAll() {
        return employees;
    }

    @Override
    public Employee update(int id, Employee employee) {
        // 기존 위치를 찾아 새 객체로 교체 후 반환
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, employee);
                return employee;
            }
        }
        return null;
    }

    @Override
    public Employee delete(int id) {
        // 삭제 성공 시 삭제된 객체 반환, 없으면 null
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.remove(i);
            }
        }
        return null;
    }

    @Override
    public List<Employee> readList(int offset, int limit, String sortBy, String order) {
        // 정렬 기준에 따라 Comparator 생성
        Comparator<Employee> comparator = null;
        if ("name".equalsIgnoreCase(sortBy)) {
            comparator = Comparator.comparing(Employee::getName);
        } else if ("age".equalsIgnoreCase(sortBy)) {
            comparator = Comparator.comparingInt(Employee::getAge);
        } else if ("salary".equalsIgnoreCase(sortBy)) {
            comparator = Comparator.comparingDouble(Employee::calcSalary);
        } else {
            comparator = Comparator.comparingInt(Employee::getId);  // 기본: id순
        }

        // 내림차순 처리
        if ("desc".equalsIgnoreCase(order)) {
            comparator = comparator.reversed();
        }

        // 정렬 → offset 건너뛰기 → limit 만큼 자르기
        return employees.stream()
                .sorted(comparator)
                .skip(offset)
                .limit(limit)
                .toList();
    }
}