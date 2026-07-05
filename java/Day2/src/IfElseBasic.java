public class IfElseBasic {
    public static void main(String[] args) {
        int score = 85; // 점수를 저장

        if (score>=90) {    // 만약 90 점 이상이면
            System.out.println("A등급"); //A등급 출력
        } else if (score >= 80) { //또 만약 80점 이상이면
            System.out.println("B등급"); //B등급 출력
        } else { //그외에
            System.out.println("c등급");  //c듭급 출력
        }
    }
}
