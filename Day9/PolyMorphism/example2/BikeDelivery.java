package Day9.PolyMorphism.example2;

import Day9.PolyMorphism.example2.Delivery;

public class BikeDelivery extends Delivery {

    @Override
    void deliver() {
        System.out.println("Bike Delivery");
    }
}