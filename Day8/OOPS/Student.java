package Day8.OOPS;

public class Student {

    int StudentId;
    String Name;
    String CollegeName;

    void study() {
        System.out.println(Name + " is studying.");
    }

    void attendClass() {
        System.out.println(Name + " is attending class.");
    }

    void displayDetails() {
        System.out.println("Student ID: " + StudentId);
        System.out.println("Name: " + Name);
        System.out.println("College Name: " + CollegeName);
    }
}