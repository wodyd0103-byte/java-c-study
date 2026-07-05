import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {
            String header = reader.readLine();   // 첫 줄: 헤더
            System.out.println("[헤더] " + header);

            String line;
            int count = 0;
            // null이 아닌 동안 계속 읽기
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");  // CSV 분리
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String dept = parts[2];
                int salary = Integer.parseInt(parts[3]);

                System.out.printf("[%s] %d세, %s, 월급 %d만원%n",
                        name, age, dept, salary);
                count++;
            }
            System.out.println("총 " + count + "명 읽기 완료!");

        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }
    }
}