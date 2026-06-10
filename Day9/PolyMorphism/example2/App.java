package Day9.PolyMorphism.example2;

import Day9.PolyMorphism.example2.Delivery;

public class App {

    public static void main(String[] args) {

        Delivery d1 = new BikeDelivery();
        Delivery d2 = new CarDelivery();
        Delivery d3 = new DroneDelivery();

        d1.deliver();
        d2.deliver();
        d3.deliver();
    }
}