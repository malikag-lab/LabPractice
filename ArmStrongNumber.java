import java.util.*;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Number must be a positive integer.");
            return;
        }

        int originalNumber = number; 
        int sum = 0;                 

        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;    
            sum += digit * digit * digit;       
            originalNumber /= 10;               
        }

        
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
