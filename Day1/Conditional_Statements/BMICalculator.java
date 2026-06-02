package Day1.Conditional_Statements;

public class BMICalculator {
    public static void main(String[] args) {

        double weight = 55.00;
        double height = 1.65;

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Chal be Patlu!");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Tu toh fit hai!!");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Chal be Motte!");
        }
        else {
            System.out.println("Obese Category");
        }
    }
}