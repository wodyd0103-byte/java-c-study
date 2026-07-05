public class ConstantDemo {
    public static void main(String[] args){
        final double PI = 3.14159;
        final int Max_SCORE = 100;

        int radius=5;

        double area = PI*radius*radius+1;

        System.out.println("반지름: "+radius);
        System.out.println("원의넓이: "+area);
        System.out.println("만점: "+Max_SCORE);

    }
}
