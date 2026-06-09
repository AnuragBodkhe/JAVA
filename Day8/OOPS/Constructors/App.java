package Day8.OOPS.Constructors;

public class App {
    public static void main(String[] args) {

        HDFC c1 = new HDFC();
        HDFC c2 = new HDFC();
        HDFC c3 = new HDFC();
        HDFC c4 = new HDFC();

        c4.name = "Rupa";
        System.out.println(c4.name);
        System.out.println(c3.AccNo);
        System.out.println(c2.balance);

    }
}