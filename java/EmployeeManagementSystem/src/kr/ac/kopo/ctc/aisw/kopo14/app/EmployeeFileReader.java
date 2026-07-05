package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.*;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;
import java.io.*;
import java.util.ArrayList;

public class EmployeeFileReader {
    static ArrayList<Employee> loadFromCSV(String filename) {
        ArrayList<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();       // 헤더 건너뛰기

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] p = line.split(",");
                    String type = p[0];
                    String name = p[1];
                    int age = Integer.parseInt(p[2]);
                    String dept = p[3];

                    switch (type) {
                        case "FULL":
                            employees.add(new FullTime(name, age, dept, Double.parseDouble(p[4])));
                            break;
                        case "CONTRACT":
                            employees.add(new Contract(name, age, dept,
                                    Double.parseDouble(p[4]), Integer.parseInt(p[5])));
                            break;
                        case "INTERN":
                            employees.add(new Intern(name, age, dept, Double.parseDouble(p[4])));
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 데이터 건너뜀: " + line);
                }
            }
            System.out.println(filename + "에서 " + employees.size() + "명 불러오기 완료!");

        } catch (FileNotFoundException e) {
            System.out.println("파일 없음 → 새 목록으로 시작합니다.");
        } catch (IOException e) {
            System.out.println("읽기 실패: " + e.getMessage());
        }
        return employees;
    }

    public static void main(String[] args) {
        ArrayList<Employee> loaded = loadFromCSV("team.csv");
        System.out.println("=== 불러온 직원 ===");
        for (Employee emp : loaded) {
            emp.print();
        }
    }
}

