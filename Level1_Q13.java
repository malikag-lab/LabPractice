//Write a program to find the side of the square whose parameter you read from user 
import java.util.*;
public class Level1_Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the perimeter of the Square: ");
        double perimeter=sc.nextDouble();

        System.out.println("The length of the side is "+(perimeter/4.0)+" whose perimeter is "+perimeter);
    }
}
