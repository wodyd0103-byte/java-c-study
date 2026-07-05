public class Student implements Comparable<Student> {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return other.score - this.score;  // 점수 내림차순 (높은 점수 먼저)
        // this.score - other.score 면 오름차순
    }

    @Override
    public String toString() {       // 출력용 메서드
        return name + "(" + score + "점)";
    }
}
