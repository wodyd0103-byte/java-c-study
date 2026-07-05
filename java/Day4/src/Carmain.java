public class Carmain {
    public static void main(String[] args) {
        Car myCar = new Car();       // 첫 번째 자동차
        myCar.brand = "현대";
        myCar.model = "아반떼";
        myCar.speed = 0;

        Car yourCar = new Car();     // 두 번째 자동차
        yourCar.brand = "기아";
        yourCar.model = "K5";
        yourCar.speed = 0;

        myCar.accelerate(60);
        myCar.accelerate(40);
        yourCar.accelerate(80);
        yourCar.brake(20);

        System.out.println("=== 현재 상태 ===");
        myCar.printStatus();
        yourCar.printStatus();
    }
}
