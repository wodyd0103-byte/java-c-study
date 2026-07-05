public class Counter {
    //==static 변수 : 모든 객체가 공유(static 영역에 저장) ==
    static int count = 0; //총 생성된 객체 수

    //== 인스턴스 변쉬: 객체마다 따로(Heap에 저장) ==
    String name; //각 객체의 이름
    int myNumber; //각 개체의 고유번호

    Counter(String name) {
        count++;
        this.name=name;
        this.myNumber = count;
        System.out.println(name + " 생성! (고유번호: " + myNumber + ")");
    }

    public static void  main(String[] args) {
        System.out.println("현재 객체 수: " + Counter.count);

        Counter c1 = new Counter("첫째");
        Counter c2 = new Counter("둘째");
        Counter c3 = new Counter("셋째");

        System.out.println("\n총 생성된 객채 수: " + Counter.count);
        System.out.println("c1 고유 번호: " + c1.myNumber);
        System.out.println("c2 고유 번호: " + c2.myNumber);
    }

}
