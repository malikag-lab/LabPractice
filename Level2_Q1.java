//Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
import java.util.*;
public class Level2_Q1 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        float number1=sc.nextFloat();
         System.out.print("Please Enter the Second Number: ");
        float number2=sc.nextFloat();

        float sum=(number1+number2), divide,multiply=(number1*number2),subtraction;
        if(number1>number2){
             divide=number1/number2;
             subtraction=number1-number2;
        }
        else{
            divide=number2/number1;
             subtraction=number2-number1;
        }

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1 + " and "+ number2+ " is "+sum+" , "+subtraction+ " , "+multiply+ " , "+divide);
    }
    
}
