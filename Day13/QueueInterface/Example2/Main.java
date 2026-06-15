package Day13.QueueInterface.Example2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Hospital hos = new Hospital();
        ArrayList<Patient> line = new ArrayList<>();

        line.add(new Patient(101, "Pankaj", 26, "TimePass"));

        line.add(new Patient(107, "Rahul", 26, "TimePass"));

        line.add(new Patient(102, "Jaanu", 26, "TimePass"));

        line.add(new Patient(105, "Ram", 26, "TimePass"));

        System.out.println(line);

        Collections.sort(line, new SortByPatientName());
        System.out.println("===================Sorted on basis of ID=============");
        System.out.println(line);
    }
}