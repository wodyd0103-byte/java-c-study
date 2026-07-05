public class CastingDemo {
    public static void main(String[] args) {
        // 1. 자동 형변환 (작은 → 큰): 안전!
        int intNum = 100;
        double doubleNum = intNum;                  // int → double
        System.out.println("자동: " + intNum + " → " + doubleNum);

        // 2. 강제 형변환 (큰 → 작은): 데이터 손실!
        double pi = 3.14159;
        int intPi = (int) pi;                      // double → int
        System.out.println("강제: " + pi + " → " + intPi);

        // 3. ⚠️ 위험한 형변환 — 오버플로!
        int bigNum = 200;
        byte smallNum = (byte) bigNum;             // int → byte
        System.out.println("위험: " + bigNum + " → " + smallNum);
    }
}