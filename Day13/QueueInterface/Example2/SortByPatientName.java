package Day13.QueueInterface.Example2;

import java.util.Comparator;

public class SortByPatientName implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getName().compareTo(o2.getName());
    }

}