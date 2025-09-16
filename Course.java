/*Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
 */

public class Course {
    String courseName;
    int fee,duration;
    static String instituteName="XYZ institute";

    Course(String courseName,int fee,int duration,String instituteName){
        this.courseName=courseName;
        this.fee=fee;
        this.duration=duration;
    }

    void displayCourseDetails(){
        System.out.println("The Name of the Institute is: "+instituteName);
        System.out.println("The Name of Course is: "+courseName);
        System.out.println("The duration of the Course is: "+duration+" months");
        System.out.println("The Fee for the Course is: "+fee);
        System.out.println();

    }

    static void updateInstituteName(String newInstituteName){
         instituteName=newInstituteName;
         System.out.println("Institute Name updated to: "+instituteName);
         System.out.println();
    }
public static void main(String[] args) {
    Course obj=new Course("Mathematics 101", 15000, 6, "XYZ institute");
    Course obj2=new Course("Science 101", 20000, 6, "XYZ institute");

    obj.displayCourseDetails();
    obj2.displayCourseDetails();

    System.out.println("Changing the Course Name");
    Course.updateInstituteName("ABC Academy");

    obj.displayCourseDetails();
    obj2.displayCourseDetails();
}    
}
