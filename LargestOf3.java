import java.util.*;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the First number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Please enter the Third number: ");
        int num3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2));
    }
}

