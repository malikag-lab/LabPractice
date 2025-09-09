//Similarly, write the DoubleOpt program by taking double values and doing the same operations.
import java.util.*;
public class Level2_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the First Value: ");
        double a=sc.nextDouble();
        System.out.print("Please Enter the Second Value: ");
        double b=sc.nextDouble();
        System.out.print("Please Enter the Third Value: ");
        double c=sc.nextDouble();

        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4=a%b+c;

        System.out.println("The results of Int Operations are "+result1+" , "+result2+" , "+result3+" , "+result4);
    }
}
