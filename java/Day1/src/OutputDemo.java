public class OutputDemo {
    public static void main(String[] args){
        String name = "전재용";
        int age=20;
        double gpa=3.123;
        // 출력후 줄바꿈
        System.out.println("===println===");
        System.out.println("이름: "+name); //줄바꿈
        System.out.println("나이: "+age); //줄바꿈
        // 출력 후 줄안바꿈
        System.out.print("===print===");
        System.out.print("과목1 "); //줄 안바꿈
        System.out.print("과목2 "); //줄 안바꿈
        System.out.println("과목3 "); //줄 바꿈
        //형식지정출력
        System.out.println("===printf===");
        System.out.printf("이름: %s, 나이: %d세\n",name,age);
        System.out.printf("학점: %.1f (소수점1자리)\n",gpa);
        System.out.printf("학점: %.2f (소수점2자리)\n",gpa);
    }
}
