package kr.ac.kopo.ctc.aisw.kopo14.app;

import kr.ac.kopo.ctc.aisw.kopo14.model.*;
import kr.ac.kopo.ctc.aisw.kopo14.service.EmployeeService;
import java.io.*;
import java.util.ArrayList;

public class EmployeeFileWriter {
    static void saveToCSV(ArrayList<Employee> employees, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("타입,이름,나이,부서,급여정보");
            writer.newLine();

            for (Employee emp : employees) {
                String line = "";
                if (emp instanceof FullTime) {
                    FullTime ft = (FullTime) emp;
                    line = "FULL," + ft.getName() + "," + ft.getAge() + ","
                            + ft.getDepartment() + "," + ft.getAnnualSalary();
                } else if (emp instanceof Contract) {
                    Contract ct = (Contract) emp;
                    line = "CONTRACT," + ct.getName() + "," + ct.getAge() + ","
                            + ct.getDepartment() + "," + ct.getHourlyRate()
                            + "," + ct.getHoursWorked();
                } else if (emp instanceof Intern) {
                    Intern in = (Intern) emp;
                    line = "INTERN," + in.getName() + "," + in.getAge() + ","
                            + in.getDepartment() + "," + in.getStipend();
                }
                writer.write(line);
                writer.newLine();
            }
            System.out.println(filename + " 저장 완료! (" + employees.size() + "명)");

        } catch (IOException e) {
            System.out.println("저장 실패: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new FullTime("김자바", 30, "개발팀", 5000));
        list.add(new Contract("이파이썬", 28, "데이터팀", 25000, 160));
        list.add(new Intern("정코틀린", 22, "개발팀", 180));

        saveToCSV(list, "team.csv");
    }
}
