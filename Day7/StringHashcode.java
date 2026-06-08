package Day7;

public class StringHashcode {
    public static void main(String[] args) {

        String fname = "Anurag";
        System.out.println(fname.hashCode()); // Print HashCode of fname

        fname = fname + " Bodkhe";
        System.out.println(fname.hashCode()); // Print HashCode of fname

    }
}