import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Number must be a positive integer.");
            return;
        }

        int originalNumber = number; 
        int sum = 0;

        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }

        
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
