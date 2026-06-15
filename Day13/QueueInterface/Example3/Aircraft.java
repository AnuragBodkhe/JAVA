package Day13.QueueInterface.Example3;

public class Aircraft implements Comparable<Aircraft> {

    private String flightNumber;
    private String airlineName;
    private int priority;
    private String destination;

    public Aircraft(String flightNumber, String airlineName,
                    int priority, String destination) {

        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.priority = priority;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public int getPriority() {
        return priority;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public int compareTo(Aircraft a) {
        return this.priority - a.priority;
    }

    @Override
    public String toString() {
        return "Aircraft [FlightNumber=" + flightNumber
                + ", AirlineName=" + airlineName
                + ", Priority=" + priority
                + ", Destination=" + destination + "]";
    }
}