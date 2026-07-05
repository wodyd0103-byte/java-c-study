public class MultiCondition {
    public static void  main(String[] args) {
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("운전 가능");
        } else if (age >= 18) {
            System.out.println("면허 회득 필요");
        } else {
            System.out.println("미성년자");
        }

        boolean isWeekend = false;
        if (!isWeekend) {
            System.out.println("출근합니다");
        }
    }
}
