//Create a program to find the maximum number of handshakes among N number of students.
import java.util.*;
public class Level1_Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number of Students: ");
        int numberOfStudents=sc.nextInt();

        int maxHandshakes=(numberOfStudents * (numberOfStudents - 1)) / 2 ;

        System.out.println("The Maximum Number of Handshakes are: "+maxHandshakes);
    }
}
