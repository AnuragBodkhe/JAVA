package Day13.QueueInterface.Example3;

import java.util.PriorityQueue;

public class Airport {

    PriorityQueue<Aircraft> runwayQueue = new PriorityQueue<>();

    void addAircraft(Aircraft air) {

        if (air.getPriority() < 1 || air.getPriority() > 4) {
            System.out.println("Invalid Priority");
            return;
        }

        for (Aircraft a : runwayQueue) {
            if (a.getFlightNumber()
                    .equalsIgnoreCase(air.getFlightNumber())) {

                System.out.println("Duplicate Flight Number");
                return;
            }
        }

        runwayQueue.offer(air);
        System.out.println("Aircraft Added");
    }

    void addMultipleAircraft(Aircraft arr[]) {

        for (Aircraft air : arr) {
            addAircraft(air);
        }
    }

    Aircraft allocateRunway() {

        if (runwayQueue.isEmpty()) {
            return null;
        }

        return runwayQueue.poll();
    }

    Aircraft viewNextAircraft() {

        if (runwayQueue.isEmpty()) {
            return null;
        }

        return runwayQueue.peek();
    }

    void displayAllWaitingAircraft() {

        if (runwayQueue.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        for (Aircraft air : runwayQueue) {
            System.out.println(air);
        }
    }

    int totalAircraft() {
        return runwayQueue.size();
    }

    void resetRunwayQueue() {
        runwayQueue.clear();
        System.out.println("Runway Queue Reset");
    }

    boolean checkQueue() {
        return runwayQueue.isEmpty();
    }
}
