package Day8.OOPS;

public class AppStudent {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.StudentId = 101;
        s1.Name = "Anurag";
        s1.CollegeName = "MIT ADT University";

        s1.displayDetails();
        s1.study();
        s1.attendClass();

        System.out.println();

        Student s2 = new Student();

        s2.StudentId = 102;
        s2.Name = "Rahul";
        s2.CollegeName = "MIT ADT University";

        s2.displayDetails();
        s2.study();
        s2.attendClass();
    }
}