public class Car {
    // === 필드: 자동차의 속성 ===
    String brand;                    // 브랜드
    String model;                    // 모델명
    int speed;                       // 현재 속도 (km/h)

    // === 메서드: 가속 ===
    void accelerate(int amount) {    // amount만큼 속도 증가
        speed += amount;
        System.out.println(model + " 가속! 현재 속도: " + speed + "km/h");
    }

    // === 메서드: 감속 ===
    void brake(int amount) {         // amount만큼 속도 감소
        speed -= amount;
        if (speed < 0) speed = 0;    // 속도는 음수가 될 수 없음
        System.out.println(model + " 감속! 현재 속도: " + speed + "km/h");
    }

    // === 메서드: 상태 출력 ===
    void printStatus() {
        System.out.println("[" + brand + " " + model + "] 속도: " + speed + "km/h");
    }
}
