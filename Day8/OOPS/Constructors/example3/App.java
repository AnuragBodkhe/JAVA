package Day8.OOPS.Constructors.example3;

public class App {
    public static void main(String[] args) {
        Product Electronic1 = new Product("Laptop", 100000);

        Product Electronic2 = new Product(Electronic1);

        System.out.println(Electronic1.name);
        System.out.println(Electronic2.name);
    }
}
