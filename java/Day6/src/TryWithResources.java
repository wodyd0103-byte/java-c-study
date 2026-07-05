import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        // === 전통적 방법: finally에서 직접 close() ===
        BufferedWriter oldWriter = null;
        try {
            oldWriter = new BufferedWriter(new FileWriter("old.txt"));
            oldWriter.write("전통 방식");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oldWriter != null) oldWriter.close();  // 번거로움!
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // === try-with-resources: 자동 close()! (Java 7+) ===
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("new.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {

            // 여러 자원을 세미콜론(;)으로 구분
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write("[복사] " + line);
                writer.newLine();
            }
            System.out.println("파일 복사 완료!");

        } catch (IOException e) {    // close()는 자동!
            System.out.println("에러: " + e.getMessage());
        }
        // try 블록이 끝나면 writer, reader 모두 자동 close()
    }
}