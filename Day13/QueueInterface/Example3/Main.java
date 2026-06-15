package Day13.QueueInterface.Example3;

public class Main {

    public static void main(String[] args) {

        Airport airport = new Airport();

        airport.addAircraft(
                new Aircraft("AI101",
                        "Air India",
                        4,
                        "Mumbai"));

        airport.addAircraft(
                new Aircraft("EM201",
                        "Emirates",
                        3,
                        "Dubai"));

        airport.addAircraft(
                new Aircraft("ME001",
                        "Medical Rescue",
                        1,
                        "Delhi"));

        airport.addAircraft(
                new Aircraft("FE500",
                        "Fuel Emergency",
                        2,
                        "Pune"));

        System.out.println();

        System.out.println("Next Aircraft");
        System.out.println(airport.viewNextAircraft());

        System.out.println();

        System.out.println("Allocate Runway");
        System.out.println(airport.allocateRunway());

        System.out.println();

        System.out.println("Waiting Aircraft");
        airport.displayAllWaitingAircraft();

        System.out.println();

        System.out.println("Total Aircraft : "
                + airport.totalAircraft());
    }
}
