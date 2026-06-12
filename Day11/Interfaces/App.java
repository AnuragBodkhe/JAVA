package Day11.Interfaces;

public class App {
    public static void main(String[] args) {

        // RestrauntService service = new RestrauntService();  // we cannot create Objects in interfaces

        System.out.println(RestaurantService.Restrauntype);

        RestaurantService order = new BurgerKing("Whooper Burger");

        order.acceptOrder("Anurag");

        order.PrepareFood();

        order.DeliverFood();

    }
}