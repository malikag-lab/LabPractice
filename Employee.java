/*Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
 */
class Manager extends Employee{

    public String manager;
    Manager( String employeeId,String department,int salary,String manager){

        super(employeeId, department, salary);
        this.manager=manager;
    }
    void displayManagerDetails(){
        System.out.println("The Employee Id is: "+employeeID);
        System.out.println("The Department is: "+department);
        System.out.println("The Salary is: "+getSalary());
        System.out.println("The Manager for this Employee is: "+manager);
        System.out.println();
    }

}
public class Employee {
    public String  employeeID;
    protected String department;
    private int salary;


    Employee(String employeeId,String department, int salary){
      this.employeeID=employeeId;
      this.department=department;
      this.salary=salary;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    int getSalary(){
        return salary;
    }
    
    void displayDetails(){
        System.out.println("The Employee Id is: "+employeeID);
        System.out.println("The Department is: "+department);
        System.out.println("The Salary is: "+salary);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Employee obj=new Employee("101", "Physics", 87000);
        System.out.println("Displaying the Employee Details below: ");
        obj.displayDetails();

        System.out.println("Changing the Salary For Employee");
        obj.setSalary(95000);
        System.out.println("Displaying the Updated Employee Details");
        obj.displayDetails();

        System.out.println("Displaying the Manager Details");
        Manager obj2=new Manager("102", "Mathematics", 98000, "Betty");
        System.out.println("Displaying the Employee and Manager Details: ");
        obj2.displayManagerDetails();
        System.out.println("Changing the Salary for the Employee");
        obj2.setSalary(100000);
        System.out.println("The Updated Employee Details are as belows");
        obj2.displayManagerDetails();
    }
}
