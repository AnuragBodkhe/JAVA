package Day8.OOPS;

public class App {

    public static void main(String[] args) {
        Maruti Baleno = new Maruti();

        Baleno.Model=2023;
        Baleno.TopSpeed=180;
        Baleno.Color="Black";

        System.out.println(Baleno.Model + " " + Baleno.TopSpeed + " " + Baleno.Color);

        Baleno.StartEngine();
        Baleno.StopEngine();


        Maruti Brezza = new Maruti();

        Brezza.Model=2023;
        Brezza.TopSpeed=180;
        Brezza.Color="White";

        System.out.println(Brezza.Model + " " + Brezza.TopSpeed + " " + Brezza.Color);

        Brezza.StartEngine();
        Brezza.StopEngine();

    }
}
