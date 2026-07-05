public class Array2D {
    public static void  main(String[] args) {
        //3명의 학생, 4과목 점수
        int[][] scores = {
                {90,85,78,92},
                {88,91,76,85},
                {79,83,90,87}
        };

        //이중 for 문으로 학생별 평균 계산
        for (int i =0; i <scores.length; i++) {
            int sum = 0;
            for (int j =0; j<scores[i].length; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum/scores[i].length;
            System.out.println("학생" +i+"평균:"+avg);
        }
    }
}
