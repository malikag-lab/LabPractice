import java.util.*;
public class Level1_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please Enter your height in cm: ");
        double height = sc.nextDouble();    

        double totalInches = height / 2.54; 
        int feet = (int)(totalInches / 12); 
        double inches = totalInches % 12;   

        System.out.println("Your height is " + height + " cm, which is approximately " 
            + feet + " feet and " + String.format("%.2f", inches) + " inches."); 
    }
}
