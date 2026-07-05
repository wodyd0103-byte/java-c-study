public class CompareLogicDemo {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID =true;

        //비교 연산자
        System.out.println("age > 18: "+(age>18));
        System.out.println("age == 20: "+(age==20));
        System.out.println("age != 25: "+(age!=25));
        System.out.println("age <= 19: "+(age<=19));
        //논리 연산자
        System.out.println("성인 and 신분증 : "+(age>=18&&hasID));
        System.out.println("미성년 or 신분증 : "+(age<18||hasID));
        System.out.println("NOT 학생: "+ !hasID);
    }
}
