//Write a program to check if a number is divisible by 5
import java.util.*;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number you wish: ");
        int num=sc.nextInt();

        if(num%5==0){
            System.out.println("Is the number "+num+" divisible by 5? "+true);
        }
        else{
            System.out.println("Is the number "+num+" divisible by 5? "+false);
        }
    }
}
