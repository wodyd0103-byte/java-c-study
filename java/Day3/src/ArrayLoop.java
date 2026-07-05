public class ArrayLoop {
    public static void main(String[] args){
        int[] score = {90,85, 78,92,88};

        // 방법 1 기본 for 문
        System.out.println("=== 기본 for 문 ===");
        for (int i = 0; i < score.length; i++) {
            System.out.println(i+"번: "+score[i]);
        }

        // 방법 2 향상된 for문 값만 사용
        System.out.println("=== 향상된 for 문 ===");
        for ( int s : score) {
            System.out.println("점수: "+ s);
        }
    }
}
