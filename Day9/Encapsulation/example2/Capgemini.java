package Day9.Encapsulation.example2;

public class Capgemini {
    private boolean insurance;
    private int workingDays;
    private double appraisal;
    private String role;

    Capgemini() {


    }

    Capgemini(boolean insurance, int workingDays, double appraisal, String role) {    // constructor to initialize the values
        this.insurance = insurance;
        this.workingDays = workingDays;
        this.appraisal = appraisal;
        this.role = role;
    }

    public void UpdateWorkingDays(String role, int days) {                // setter used for updating working days
        if (role.equals("Manager") || role.endsWith("Director")) {
            this.workingDays = days;
        }
    }

    public void UpdateAppraisal(String role, double amt) {
        if (role.equals("Director")) {
            this.appraisal = amt;
        }
    }

    public void UpdateAppraisal(Capgemini obj, double amt) {
        if (this.role.equals("Director")) {
            obj.appraisal = amt;
        }
    }

            public void showDetails () {
                System.out.println(insurance + " " + workingDays + " " + appraisal + " " + role);
            }
        }