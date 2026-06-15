package Day12.SetInterface.example2;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        AdmissionSystem system = new AdmissionSystem();

        Student arr[] = { new Student(101, "Anurag", "Anurag@gmail.com", "B.TECH"),
                new Student(102, "Shlok Kumar", "SHLOK@gmail.com", "MBA"),
                new Student(104, "Pankaj", "PANKAJ@gmail.com", "BCA"),
                new Student(107, "Dhanashri", "Dhanashri@gmail.com", "MCA")
        };

        system.registerMultipleStudents(arr);

        system.displayStudents();

    }
}
