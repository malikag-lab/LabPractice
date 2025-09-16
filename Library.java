/*
 * Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
 */

import java.util.Scanner;

public class Library {
    String title,author;
    int price;
    boolean availability;

    Library(String title, String author, int price, boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }

    void borrow(){
        if(availability){
            System.out.println("The Book "+title+" has now been successfully borrowed by you");
            availability=false;
        }
        else{
            System.out.println("Sorry, The Book "+title+" has  been already borrowed ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Name of the Book: ");
        String title=sc.nextLine();
        System.out.print("Please Enter the Author of the Book: ");
        String author=sc.next();
        System.out.print("Please Enter the price of the Book: ");
        int price=sc.nextInt();
        System.out.print("Please Enter the availability of the Book: ");
        boolean availability=sc.nextBoolean();

        Library obj=new Library(title, author, price, availability);
        obj.borrow();
        obj.borrow();

    }
}
