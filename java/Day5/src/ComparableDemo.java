import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("김자바", 85),
                new Student("이파이썬", 92),
                new Student("박스프링", 78),
                new Student("최코틀린", 95)
        };

        System.out.println("정렬 전: " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("정렬 후: " + Arrays.toString(students));
    }
}
