/*Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
 */
class PostgraduateStudent extends Student{
  public String specialization;

  PostgraduateStudent(String rollNumber,String name,double CGPA,String specialization)
  {
    super(rollNumber, name, CGPA);
    this.specialization=specialization;
  }

  void displayPGDetails(){
    System.out.println("The Name of the PostGraduate Student is: "+name);
    System.out.println("The Roll Number of the PostGraduate Student is: "+rollNumber);
    System.out.println("The CGPA of the PostGraduate Student is: "+getCGPA());
    System.out.println("The Specialization of the PostGraduate Student is: "+specialization);
  }
}
public class Student {
   public String rollNumber;
   protected String name;
   private double CGPA;

   Student(String rollNumber,String name, double CGPA){
       this.rollNumber=rollNumber;
       this.name=name;
       this.CGPA=CGPA;
   }
    double getCGPA(){
    return CGPA;
   }
    void setCGPA(double newCGPA){
     CGPA=newCGPA;
   }

    void displayDetails(){
        System.out.println("The Name of the Student is: "+name);
        System.out.println("The Roll Number of the Student is: "+rollNumber);
        System.out.println("The CGPA of the Student is: "+CGPA);
        System.out.println();
    }


public static void main(String[] args) {
    Student obj=new Student("101", "Jane", 8.75);
    obj.displayDetails();
    System.out.println("Changing the CGPA to 9.0");
    obj.setCGPA(9.0);
    System.out.println();
    System.out.println("Displaying the Updated Details: ");
    obj.displayDetails();
    System.out.println();
    System.out.println("Displaying the Details of a PostGraduate Student: ");
    PostgraduateStudent obj2=new PostgraduateStudent("102", "John", 9.0, "Discrete Mathematics");
    obj2.displayPGDetails();
    System.out.println("Changing the CGPA to 9.5");
    obj2.setCGPA(9.5);
    System.out.println();
    System.out.println("Displaying the Updated Details: ");
    obj2.displayPGDetails();

}    
}
