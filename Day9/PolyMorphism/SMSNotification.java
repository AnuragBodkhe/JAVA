package Day9.PolyMorphism;

public class SMSNotification extends Notification{

    @Override
    void send() {
        System.out.println("sending SMS Notification");
    }
}
