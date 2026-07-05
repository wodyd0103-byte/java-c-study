public class Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i<= 4; i++) {
            System.out.println("[ "+i+"단 ]");
            for (int j =1 ; j<=9; j++) {
                System.out.printf("%d x %d = %2d\n",i,j,i * j);
            }
            System.out.println();
        }
    }
}
