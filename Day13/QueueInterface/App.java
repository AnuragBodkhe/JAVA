package Day13.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

        Queue<String> TicketsLine = new LinkedList<>();

        TicketsLine.offer("Anurag");
        TicketsLine.offer("Dhani");
        TicketsLine.offer("Dhanashri");
        TicketsLine.offer("Mann");

        System.out.println(TicketsLine);

        System.out.println(TicketsLine.peek());

        System.out.println(TicketsLine.poll());

        System.out.println(TicketsLine);

        System.out.println(TicketsLine.size());

        TicketsLine.clear();

        System.out.println(TicketsLine.isEmpty());
    }
}
