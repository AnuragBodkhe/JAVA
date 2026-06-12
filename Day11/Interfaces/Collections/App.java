package Day11.Interfaces.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("anurag");
        students.add("chinki");
        students.add("pinki");
        students.add("ramu");
        students.add("kaka");

        System.out.println(students);

        for (String st : students) {
            if (st == "pinki") {
                System.out.println("Element found ! ");
                System.out.println(students.indexOf("pinki"));

            }
        }

        students.add(3, "dhanashri");

        System.out.println(students);

        System.out.println(students.get(3));

        System.out.println(students.set(0, "dhani"));

        System.out.println(students);

        System.out.println(students.remove("ramu"));

        System.out.println(students);

        System.out.println(students.contains("chinkiiii"));

        System.out.println(students.size());

        // students.clear();

        System.out.println(students.isEmpty());

        Collections.sort(students);

        System.out.println(students);

        Collections.reverse(students);

        System.out.println(students);

    }
}