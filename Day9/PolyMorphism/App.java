package Day9.PolyMorphism;

public class App {
    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();

        paymentService.pay(100);
        paymentService.pay(500, "anurag@123");
        paymentService.pay(1000, "anurag@123", 123456789);


        Notification s1 = new EmailNotification();
        Notification s2 = new SMSNotification();
        Notification s3 = new WhatsAppNotification();

        s1.send();
        s2.send();
        s3.send();
    }
}
