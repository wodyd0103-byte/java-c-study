public class MethodParam {
    //배열을 받아서 평균을 반환하는 매서드
    static double getAverage(int[] scores) {
        int sum=0;
        for(int s : scores) {
            sum += s;
        }
        return (double) sum/scores.length;
    }

    static int getMax(int[] scores){
        int max = scores[0];
        for(int s: scores){
            if ( s > max) max = s;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {90,85,78,92,88};
        System.out.println("평균: "+getAverage(data));
        System.out.println("최고점: "+getMax(data));
    }
 }
