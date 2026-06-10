package Day9.PolyMorphism;
public class PaymentService {
    void pay(double amt) {
        System.out.println("paid with cash " + amt);

    }

    void pay(double amt, String UpiId) {
        System.out.println("paid with upi " + UpiId + " amt = " + amt);

    }

    void pay(double amt, String UpiId, int CardNumber) {
        System.out.println("paid with card " + CardNumber + " amt = " + amt);

    }
}
