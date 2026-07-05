public class SelfIntro {
    public static  void main(String[] args) {
        // 나만의 정보 변수 저장
        String name = "전재용"; // 이름
        int age =26; // 나이
        double gpa = 3.0; // 학점 실수형
        char bloodType = 'B'; //혈액형 문자형
        boolean hasPet = false; //반려동물 논리형

        System.out.println("===자기소개서===");
        System.out.println("이름:"+name);
        System.out.println("나이:"+age);
        System.out.println("학점:"+gpa);
        System.out.println("혈액형:"+bloodType );
        System.out.println("반려동물"+(hasPet ? "있음":"없음"));
    }
}
