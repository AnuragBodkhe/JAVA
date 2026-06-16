package Day14.MAPInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anurag");
        employees.put(102, "Dhani");
        employees.put(102, "Rahul");
        employees.put(103, "Ravi");
        employees.put(105, "Mann");

        System.out.println(employees.keySet());

        for (Integer i : employees.keySet()) {
            System.out.println(employees.get(i));
        }

        System.out.println(employees.values());

        for(Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry);
        }



        System.out.println(employees);

        System.out.println(employees.get(101));

        employees.getOrDefault(101, "Anurag");
        System.out.println(employees.getOrDefault(999, "user not found"));

        employees.putIfAbsent(103, "Dhani");
        System.out.println(employees);

        System.out.println(employees.containsKey(12));
        System.out.println(employees.containsValue("Anurag"));

        employees.remove(101);
        System.out.println(employees);

        employees.remove(103, "Ravi");
        System.out.println(employees);

        employees.replace(102, "Dhanashri");
        System.out.println(employees);

        employees.replace(105, "Mann", "Anu");
        System.out.println(employees);



        Map<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Anurag");
        students.put(102, "Ravi");
        students.put(103, "Rahul");
        students.put(103, "Ravi");
        students.put(100, "Dhanashri");
        students.put(null, null);

        System.out.println(students);

        Map<Integer, String> products = new TreeMap<>();

        products.put(201, "chips");
        products.put(190, "icecream");
        products.put(215, "cold-drink");

        System.out.println(products);

    }
}
