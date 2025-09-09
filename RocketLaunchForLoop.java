import java.util.*;
public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int start = sc.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
