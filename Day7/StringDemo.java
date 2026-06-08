package Day7;

public class StringDemo {
    public static void main(String[] args) {
        String name1 = "Anurag";
        System.out.println(name1); // Print name1 only

        String name2 = "Anurag";
        System.out.println(name2); // Print name2 only

        System.out.println(name1 == name2); // Print false Compare name1 and name2


        System.out.println(name1 + name2); // AnuragBodkhe Print both names together


        String CollegeName1 = new String("MIT ADT University");
        System.out.println(CollegeName1);

        String CollegeName2 = new String("MIT ADT University");
        System.out.println(CollegeName2);

        System.out.println(CollegeName1 == CollegeName2); // Print false Compare CollegeName1 and CollegeName2

        System.out.println(CollegeName1.equals(CollegeName2)); // Print true Compare CollegeName1 and CollegeName2

    }
}
