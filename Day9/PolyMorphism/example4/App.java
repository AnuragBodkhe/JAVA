package Day9.PolyMorphism.example4;

public class App {

    public static void main(String[] args) {

        String vehicles[] = {
                "car", "bike", "truck",
                "truck", "car", "bike"
        };

        int carCount = 0;
        int bikeCount = 0;
        int truckCount = 0;

        int carToll = 0;
        int bikeToll = 0;
        int truckToll = 0;

        int totalToll = 0;

        for (String vehicle : vehicles) {

            Parking p = null;

            if (vehicle.equalsIgnoreCase("car")) {
                p = new CarParking();
                carCount++;
                carToll += p.toll();
            }
            else if (vehicle.equalsIgnoreCase("bike")) {
                p = new BikeParking();
                bikeCount++;
                bikeToll += p.toll();
            }
            else if (vehicle.equalsIgnoreCase("truck")) {
                p = new TruckParking();
                truckCount++;
                truckToll += p.toll();
            }

            totalToll += p.toll();
        }

        System.out.println("Cars   : " + carCount);
        System.out.println("Bikes  : " + bikeCount);
        System.out.println("Trucks : " + truckCount);

        System.out.println();

        System.out.println("Car Toll   : " + carToll);
        System.out.println("Bike Toll  : " + bikeToll);
        System.out.println("Truck Toll : " + truckToll);

        System.out.println();

        System.out.println("Total Toll : " + totalToll);
    }
}