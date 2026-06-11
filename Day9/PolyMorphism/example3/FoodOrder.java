package Day9.PolyMorphism.example3;

public class FoodOrder {
    void order() {                                 // Function Overloading
        System.out.println("No item selected");
    }

    void Order(String name){                         // Function Overloading
        System.out.println("Ordered Item: " + name);
    }

    void Order(String name, int quantity){                // Function Overloading

        int price = 20;
        int total = price * quantity;

        System.out.println("Ordered Item: " + name + " Quantity " + quantity + " Total " + total);
    }

    void Order(String item, int Quantity, double Discount){               // Function Overloading

        int price = 20;
        double total = Quantity * price;

        total = (total * Discount / 100);

        System.out.println("Ordered Item: " + item + " Quantity " + Quantity + " Total with discount " + total);
    }

    void Order(String items[], int Quantity[]){                 // Function Overloading

        int grandTotal = 0;
        int price = 200;

        for(int i = 0; i < items.length; i++){               // Loop through the items array and calculate the grand total
            int bill = Quantity[0] * price;
            grandTotal += bill;

            System.out.println(items[i] + " -> " + Quantity[i]);
        }

        System.out.println("Grand Total of you cart is " + " -> " + grandTotal);

    }
}
