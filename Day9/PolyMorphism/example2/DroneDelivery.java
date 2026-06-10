package Day9.PolyMorphism.example2;

import Day9.PolyMorphism.example2.Delivery;

public class DroneDelivery extends Delivery {

    @Override
    void deliver() {
        System.out.println("Drone Delivery");
    }
}