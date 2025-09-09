//Write a program to find the side of the square whose parameter you read from the user.
import java.util.*;
public class Level2_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the perimeter of the Square: ");
        double perimeter=sc.nextDouble();

        System.out.println("The length of the side is "+(perimeter/4.0)+" whose perimeter is "+perimeter);
    }
}
