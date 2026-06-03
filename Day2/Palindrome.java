package Day2;

public class Palindrome {
    public static void main(String[] args) {
        int num = 458;
        int temp=num;
        int reverse=0;
        while (num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if (temp==reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
