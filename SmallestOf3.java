//Write a program to check if the first is the smallest of the 3 numbers.
import java.util.*;

public class SmallestOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the First number: ");
        int num1=sc.nextInt();
        System.out.print("Please Enter the Second number: ");
        int num2=sc.nextInt();
        System.out.print("Please Enter the Third number: ");
        int num3=sc.nextInt();

        System.out.println("Is the first number the smallest? "+((num1<num2)&&(num1<num3)));
    }
}
