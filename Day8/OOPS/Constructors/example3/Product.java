package Day8.OOPS.Constructors.example3;

public class Product {
    String name; // class attributes
    int price; // instance variables -> current objects

    Product(String name, int price){ // constructor
        this.name = name;
        this.price = price;
    }

    Product(Product otherProduct){
        this.name = otherProduct.name;
        this.price = otherProduct.price;

    }
}
