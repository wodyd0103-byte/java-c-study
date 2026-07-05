public class StringvsStringBuiler {
    public static void main(String[] args){
        // String 연산 시간 측정
        long stringStart = System.nanoTime();
        String result = "";

        for (int i = 0; i < 10000; i++) {
            result += i + " ";  // 매번 새 객체 생성!
        }
        long stringEnd = System.nanoTime();
        long stringElapsed = stringEnd - stringStart;
        System.out.println("String 실행 시간: " + stringElapsed + " ns");
        System.out.println("String 실행 시간: " + (stringElapsed / 1_000_000.0) + " ms");

        // StringBuilder 연산 시간 측정
        long sbStart = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i).append(" ");  // 같은 객체 재사용
        }
        long sbEnd = System.nanoTime();
        String result1 = sb.toString();
        long sbElapsed = sbEnd - sbStart;
        System.out.println("StringBuilder 실행 시간: " + sbElapsed + " ns");
        System.out.println("StringBuilder 실행 시간: " + (sbElapsed / 1_000_000.0) + " ms");
    }
}