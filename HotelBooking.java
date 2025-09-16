/*Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
 */

import java.util.Scanner;

public class HotelBooking {
    String guestName,roomType;
    int nights;

    HotelBooking(){
        guestName="unknown";
        roomType="standard";
        nights=1;
    }

    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    HotelBooking(HotelBooking ref){
        this.guestName=ref.guestName;
        this.roomType=ref.roomType;
        this.nights=ref.nights;
    }
    void display(){
        System.out.println("The Name of the Guest is: "+guestName+ " , the Type of the Room is: "+roomType+" and the Number of nights are: "+nights);
    }


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter the Name of the Guest: ");
    String guestName=sc.next();
    System.out.print("Please Enter the Type of the Room: ");
    String roomType=sc.next();
    System.out.print("Please Enter the Number of Nights: ");
    int nights=sc.nextInt();

    System.out.println("The Values initialized using default constructor are as belows: ");
    HotelBooking obj=new HotelBooking();
    obj.display();

    System.out.println("The Values initialized using Parameterized constructor are as belows: ");
    HotelBooking obj2=new HotelBooking(guestName,roomType,nights);
    obj2.display();

    System.out.println("The Values initialized using Copy constructor are as belows: ");
    HotelBooking obj3=new HotelBooking(obj2);
    obj3.display();
}    
}
