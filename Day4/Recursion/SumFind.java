package Day4.Recursion;

public class SumFind {
    static int SumFind(int n){
        if(n==1){
            return 1;
        }
        return n+SumFind(n-1);
    }

    public static void main(String[] args) {
        System.out.println(SumFind(10));
    }
}
