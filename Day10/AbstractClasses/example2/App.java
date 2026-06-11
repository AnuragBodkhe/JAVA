package Day10.AbstractClasses.example2;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Developer(201, "Anurag", 1200000);
        Employee e2 = new Developer(301, "Mann", 1200000);

        System.out.println(e1.equals(e2));

        e1.calculateAnnualSalary();
    }
}