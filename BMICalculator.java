import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Weight and height must be positive values.");
            return;
        }

        
        double heightMeters = heightCm / 100.0;

        
        double bmi = weight / (heightMeters * heightMeters);

        System.out.printf("BMI: %.2f\n", bmi);

        
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
