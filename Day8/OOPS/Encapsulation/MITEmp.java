package Day8.OOPS.Encapsulation;

public class MITEmp {
    public String name;
    public int id;
    public double salary;

    MITEmp(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(salary);
    }

    void setSalary(int amt) {
        salary = amt;
    }
}
