//Write a program to find the distance in yards and miles for the distance provided by the user in feet
import java.util.*;
public class Level2_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the distance in feet: ");
        double distanceFeet = sc.nextDouble();

        double yards = distanceFeet / 3.0;
        double miles = distanceFeet / 5280.0;

        System.out.println("The distance in feet: " + distanceFeet +
                           ", in yards: " + yards +
                           ", in miles: " + miles);
    }
}
