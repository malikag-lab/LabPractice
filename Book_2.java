/*Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
 */
class Ebook extends Book_2{
    public int filesize;
   Ebook(String ISBN,String title,String author, int filesize){
        super(ISBN, title, author);
        this.filesize=filesize;
   }

   void displayEbookDetails(){
    System.out.println("The ISBN Number of the Book is: "+ISBN);
    System.out.println("The Title of the Book is: "+title);
    System.out.println("The Author of the Book is: "+getAuthor());
    System.out.println("The FileSize of the Book is: "+filesize);
    System.out.println();
   }
}
public class Book_2 {
    public String ISBN;
    protected String title;
    private String author;
    
    
    Book_2(String ISBN, String title, String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }

    String getAuthor(){
        return author;
    }

    void setAuthor(String author){
        this.author=author;
    }

    void displayBookDetails(){
    System.out.println("The ISBN Number of the Book is: "+ISBN);
    System.out.println("The Title of the Book is: "+title);
    System.out.println("The Author of the Book is: "+author);
    System.out.println();
    }
    public static void main(String[] args) {
        Book_2 obj=new Book_2("101-102", "To Kill a Mockingbird", "Harper Lee");
        obj.displayBookDetails();
        System.out.println();
        System.out.println("Updating the Author of the Book: ");
        obj.setAuthor("James Lee");
        System.out.println();
        System.out.println("Displaying Updated Book details: ");
        obj.displayBookDetails();

        Ebook obj2=new Ebook("101-103", "Harry Potter", "JK Rowling", 100);
        obj2.displayEbookDetails();
        System.out.println();
        System.out.println("Updating the Author of the EBook: ");
        obj2.setAuthor("James Wan");
        System.out.println();
        System.out.println("Displaying Updated Ebook Details: ");
        obj2.displayEbookDetails();
    }
}
