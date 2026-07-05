import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // == 생성: = String만 넣을 수 있음 ==
        ArrayList<String> names = new ArrayList<>();

        // == 추가: add() ==
        names.add("김자바");  // 맨 뒤에 추가
        names.add("이파이썬");
        names.add("박스프링");
        names.add(1,"최코틀링"); // 인덱스 1에 삽입

        System.out.println("전체: "+names);
        System.out.println("크리: "+names.size());

        // == 조회: get() ==
        System.out.println("0번: "+names.get(0));

        // == 결석: contains(), Index0f() ==
        System.out.println("박스프링 포함? "+names.contains("박스프링"));
        System.out.println("박스프링 위치: "+names.indexOf("박스프링"));

        // == 삭제: remove() ==
        names.remove(0); // 인덱스트 삭제
        names.remove("이파이썬"); //값으로 삭제
        System.out.println("삭제 후: "+names);

        // === 향상된 for문으로 순회 ===
        System.out.println("--- 전체 출력 ---");
        for (String name : names) {
            System.out.println("  " + name);
        }
    }
}
