package Day9.PolyMorphism.example2;

import Day9.PolyMorphism.example2.Delivery;

public class CarDelivery extends Delivery {

    @Override
    void deliver() {
        System.out.println("Car Delivery");
    }
}