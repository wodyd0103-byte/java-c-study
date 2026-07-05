// == 사용자 정의 예외: 잔액 부족 ==

class InsufficientBalanceException extends Exception {
    private double balance; //현재 잔액
    private double amout; //출금 요청액

    InsufficientBalanceException(double balance, double amout) {
        super("잔액 부족!! 잔액: " + balance + "원, 출금 요청: " + amout + "원");
        this.balance =balance;
        this.amout = amout;
    }

    public double getBalance() {return balance;}
    public double getAmout() {return  amout;}
}

// == 은행 계좌 클래스
class BankAccount{
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //throws로 사용자 정의 예외 선언
    void withdraw(double amount) throws InsufficientBalanceException{
        if (amount>balance) {
            throw new InsufficientBalanceException(balance,amount);
        }
        balance -= amount;
        System.out.printf("%s: %.0f원 출금 완료 (잔액: %.0f원)%n", owner,amount,balance);

    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("김자바", 50000);
        try {
            acc.withdraw(30000); //성공
            acc.withdraw(30000); //잔액 부족! -> 예외 발생
        } catch (InsufficientBalanceException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}

