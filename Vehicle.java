/*Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
 */

public class Vehicle {
    String ownerName,vehicleType;
    static int registrationFee=10000;

    Vehicle(String ownerName,String vehicleType){
       this.ownerName=ownerName;
       this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
       System.out.println("The Name of the Owner of Vehicle is: "+ownerName);
       System.out.println("The Type of the Vehicle is: "+vehicleType);
       System.out.println("The Registration Fee is: "+registrationFee);
    }
    static void updateRegistrationFee(int newRegistrationFee){
       registrationFee=newRegistrationFee;
       System.out.println("The New Registration Fee is: "+registrationFee);
    }

    public static void main(String[] args) {
       Vehicle obj=new Vehicle("Malika", "SUV");
       Vehicle obj2=new Vehicle("John", "Sedan");
       
       obj.displayVehicleDetails();
       obj2.displayVehicleDetails();

       System.out.println("Changing the Registration Fee, Details after the change: ");
       Vehicle.updateRegistrationFee(20000);
       obj.displayVehicleDetails();
       obj2.displayVehicleDetails();
    }
}
