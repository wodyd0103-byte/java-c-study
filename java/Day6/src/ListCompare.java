import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;             // 인터페이스 타입으로 선언!

public class ListCompare {
    public static void main(String[] args) {
        // === 다형성: List 인터페이스로 선언 ===
        List arrayList = new ArrayList<>();
        List linkedList = new LinkedList<>();

        // 같은 메서드로 동일하게 사용!
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 중간 삽입
        arrayList.add(1, "X");       // 인덱스 1에 삽입
        linkedList.add(1, "X");
        System.out.println("삽입 후 ArrayList: " + arrayList);
        System.out.println("삽입 후 LinkedList: " + linkedList);
    }
}
