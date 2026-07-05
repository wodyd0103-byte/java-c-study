import java.util.HashSet;
import java.util.ArrayList;

public class HashSetDemo {
    public static void main(String[] args) {
        // === HashSet: 중복 자동 제거 ===
        HashSet fruits = new HashSet<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("사과");           // 중복! → 무시됨
        fruits.add("포도");
        fruits.add("바나나");          // 중복! → 무시됨

        System.out.println("과일 Set: " + fruits);
        System.out.println("크기: " + fruits.size());

        // === 포함 여부 확인 ===
        System.out.println("사과 있나? " + fruits.contains("사과"));

        // === 실전: List의 중복 제거 ===
        ArrayList listWithDupes = new ArrayList<>();
        listWithDupes.add("A");
        listWithDupes.add("B");
        listWithDupes.add("A");
        listWithDupes.add("C");
        listWithDupes.add("B");
        System.out.println("\n중복 있는 List: " + listWithDupes);

        HashSet uniqueSet = new HashSet<>(listWithDupes);
        ArrayList uniqueList = new ArrayList<>(uniqueSet);
        System.out.println("중복 제거 후: " + uniqueList);
    }
}
