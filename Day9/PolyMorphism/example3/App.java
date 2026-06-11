package Day9.PolyMorphism.example3;

public class App {
    public static void main(String[] args) {
        FoodOrder cust1 = new FoodOrder();

      //  cust1.Order("Chips", 4, 10);

        String items[] = {"Chips", "Icecream", "Fries"};
        int quantity[] = {2, 1, 3};

        cust1.Order(items, quantity);

    }
}
