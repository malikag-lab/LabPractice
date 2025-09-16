/*Create a Person class with a copy constructor that clones another person's attributes. */
import java.util.*;
public class Person {
    String name;
    int age;

    Person(){
       name="null";
       age=0;
    }
    Person(String name, int age){
       this.name=name;
       this.age=age;
    }
    Person(Person ref){
       this.name=ref.name;
       this.age=ref.age;
    }
    void display(){
        System.out.println("The Name of the person is: "+name+" and the Age is: "+age);
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Name: ");
     String name=sc.next();   
     System.out.print("Enter the Age: ");
     int age=sc.nextInt();

     System.out.println("The Parameterized Constructor being called with the values passed");
     Person obj=new Person(name, age);
     obj.display();
     System.out.println("The Copy Constructor being called with the values copied from previous object");
     Person obj2=new Person(obj);
     obj2.display();
    }
}
