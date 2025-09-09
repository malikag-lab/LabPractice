import java.util.*;

public class Level1_Q14 {
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
