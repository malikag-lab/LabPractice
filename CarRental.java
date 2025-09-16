/*
 * Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
 */

import java.util.Scanner;

public class CarRental {
    String customerName,carModel;
    int rentalDays,totalCost=0;

    CarRental(String customerName,String carModel, int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;

    }

    void ComputeCost(){
        if(carModel.equals("Suv")){
           totalCost=3000*rentalDays;
        }
        else if(carModel.equals("Sedan")){
           totalCost=2000*rentalDays;
        }
        else{
           totalCost=1500*rentalDays;
        }
    }

    void display(){
        System.out.println("The Customer Name is: "+customerName+" , the Model of the Car is: "+carModel+" , the days it was rented for is: "+rentalDays+" and the total cost of renting it was: "+totalCost);
    }

   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Please Enter the Name of the Customer: ");
     String customerName=sc.next();
     System.out.print("Please Enter the Model of the Car (Choose From: Suv and Sedan): ");
     String carModel=sc.next();
     System.out.print("Please Enter the Days it was rented for: ");
     int rentalDays=sc.nextInt();

     CarRental obj=new CarRental(customerName, carModel, rentalDays);
     obj.ComputeCost();
     obj.display();
   } 
}
