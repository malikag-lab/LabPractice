////The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
import java.util.*;
public class Level1_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Fee: ");
        int fee=sc.nextInt();
        System.out.print("Please Enter the Discount Percentage: ");
        int discountPercent=sc.nextInt();

        int discount= (fee*discountPercent)/100;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
    }
}
