//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
import java.util.*;
public class Level1_Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();

        
        double areaCm2 = 0.5 * base * height;

        
        double areaIn2 = areaCm2 * 0.1550;

        System.out.println("The area of the triangle is:");
        System.out.println(areaCm2 + " square centimeters");
        System.out.println(areaIn2 + " square inches");

    }
    
    
}
