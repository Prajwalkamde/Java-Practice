package Abstraction;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();

        p1.pay();
        p2.pay();

    }
}

class UpiPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

class CardPayment implements  Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using CARD");
    }
}
