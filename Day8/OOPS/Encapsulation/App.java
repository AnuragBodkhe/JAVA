package Day8.OOPS.Encapsulation;

public class App {
    public static void main(String[] args){
        MITEmp Teacher = new MITEmp("Anurag", 123, 100000);

        MITEmp director = new MITEmp("Director", 420, 125718);

        //Teacher.showSalary(); // Print salary

        director.setSalary(700000);
        director.showSalary();
        
    }
}
