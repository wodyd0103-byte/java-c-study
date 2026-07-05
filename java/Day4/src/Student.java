public class Student {
    //필드
    String name; //학생 이름
    int kor, eng, math; // 국영수 점수

    //매서드 총점 계산(반환값 있음)
    int getTotal() {
        return  kor+eng+math; //세과목합계
    }

    //매서드:성적표출력(반환값 있음)
    double getAverage(){
        return getTotal() /3.0; //3.0으로 나눠야 소수점 나옴
    }

    //매서드: 성적표 출력(반환값 없음)
    void printReport() {
        System.out.println("["+name+"의 성적표]");
        System.out.println("국어: "+ kor +" | 영어: "+eng+" | 수학: " +math);
        System.out.println("총점: "+getTotal()+" | 평균: "+getAverage() );
    }

}
