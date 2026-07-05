public class SwitchDemo {
    public static void main(String[] args) {
        int day =3;

        switch (day) {
            case 1: System.out.println("월요일"); break;
            case 2: System.out.println("화요일"); break;
            case 3: System.out.println("수요일"); break;
            default: System.out.println("기타");
        }

        String result = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            default -> "기타";
        };
        System.out.println("화살표: "+result);
    }
}
