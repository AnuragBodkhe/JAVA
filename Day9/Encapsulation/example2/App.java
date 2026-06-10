package Day9.Encapsulation.example2;

public class App {
    public static void main(String[] args) {
        Capgemini Anurag = new Capgemini(true, 5, 9.5, "Developer");
        Capgemini Jhatuu = new Capgemini(false, 3, 12.5, "Manager");
        Capgemini Mann = new Capgemini(true, 1, 20.2, "Director");

        Jhatuu.showDetails();                               // role match for update the details only for working days
        Jhatuu.UpdateWorkingDays("Manager", 2);
        Jhatuu.showDetails();

        Anurag.showDetails();                                  // no change because role not match for update the details
        Anurag.UpdateWorkingDays("Developer", 4);
        Anurag.showDetails();

        Mann.showDetails();
        Mann.UpdateAppraisal("Director", 25.5);     // role match for make changes for Appraisal
        Mann.showDetails();

        Mann.showDetails();
        Mann.UpdateAppraisal(Anurag, 25.5);     // role match for make changes for Appraisal
        Anurag.showDetails();

    }
}
