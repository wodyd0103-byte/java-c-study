import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) {
        //==try,with,resources: 자동으로 close() 호출==
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.csv"))) {
            // csv 헤더 작성
            writer.write("이름,나이,부서,월급");
            writer.newLine(); //줄바꿈

            // 데이터 작성
            writer.write("김자바,30,개발팀,471");
            writer.newLine();
            writer.write("이파이썬,28,데이터팀,400");
            writer.newLine();
            writer.write("박스프링,35,백엔드팀,500");
            writer.newLine();

            System.out.println("employees.csv 파일 저장 완료!");
        } catch (IOException e) { //파일 I/O 예외 처리
            throw new RuntimeException("파일 쓰기 실패: "+e.getMessage());
        }
        //try 블록 끝나면 writer가 자동으로 close()됨!
    }
}
