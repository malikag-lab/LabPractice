//Write a program to take 2 numbers and print their quotient and reminder.
import java.util.*;
public class Level2_Q6 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter the First Number: ");
    int number1=sc.nextInt();
    System.out.print("Please Enter the Second Number: ");
    int number2=sc.nextInt();
    
    System.out.println("The Quotient is "+(number1/number2)+" and Reminder is "+(number1%number2)+" of two numbers "+number1+" and "+number2);
 }   
}
