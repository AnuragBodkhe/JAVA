package Day4.Recursion;

public class ExponentFind {
    static int Power(int base, int Power){
        if(Power==0){
            return 1;
        }
        return base*Power(base, Power-1);
    }

    public static void main(String[] args) {
        System.out.println(Power(5,4)  );
    }
}

