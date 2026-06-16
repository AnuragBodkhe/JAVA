package Day14.MAPInterface.example2;

public class Main {
    public static void main(String[] args) {

        OrderManager swiggy = new OrderManager();

        // Customers
        swiggy.addCustomer(new Customer(101, "Virat", "virat@gmail.com"));
        swiggy.addCustomer(new Customer(102, "Rohit Sharma", "rohit@gmail.com"));
        swiggy.addCustomer(new Customer(103, "MS Dhoni", "dhoni@gmail.com"));
        swiggy.addCustomer(new Customer(104, "Hardik", "hardik@gmail.com"));

        // Orders
        swiggy.addOrder(new Order(1001, 101, "Chicken Biryani", 350));
        swiggy.addOrder(new Order(1002, 101, "Coke", 60));

        swiggy.addOrder(new Order(1003, 102, "Vada Pav", 450));
        swiggy.addOrder(new Order(1004, 102, "Garlic Bread", 180));
        swiggy.addOrder(new Order(1005, 102, "Brownie", 120));

        swiggy.addOrder(new Order(1006, 103, "Masala Dosa", 120));
        swiggy.addOrder(new Order(1007, 103, "Filter Coffee", 80));

        swiggy.addOrder(new Order(1008, 104, "Burger", 220));
        swiggy.addOrder(new Order(1009, 104, "French Fries", 150));
        swiggy.addOrder(new Order(1010, 104, "Chocolate Shake", 180));

        System.out.println("\n===== CUSTOMERS =====");
        swiggy.displayCustomers();

        System.out.println("\n===== ORDERS =====");
        swiggy.displayOrders();

        System.out.println("\n===== ORDERS OF CUSTOMER 102 =====");
        swiggy.displayOrdersOfCustomers(102);

        System.out.println("\n===== TOTAL SPENDING =====");
        swiggy.calculateTotalSpending(101);
        swiggy.calculateTotalSpending(102);
        swiggy.calculateTotalSpending(103);
        swiggy.calculateTotalSpending(104);

        System.out.println("\n===== HIGHEST SPENDING CUSTOMER =====");
        swiggy.findHighesSpendingCustomer();

        System.out.println("\n===== ORDER COUNT PER CUSTOMER =====");
        swiggy.countOrdersPerCustomer();
    }
}