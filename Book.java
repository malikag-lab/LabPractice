/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
 */
public class Book{
    String title,author;
    int price;

    Book(){
        title="To Kill a Mockingbird";
        author="Harper Lee";
        price=4200;
    }
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("The Name of the Book is: "+title+" , Author is: "+author+ " and the price is: "+price);
    }
    public static void main(String[] args) {
        Book obj=new Book(); 
        obj.display(); // This will print the values assigned through default constructor

        Book obj2=new Book("Harry Potter","J.K. Rowling",5700);
        obj2.display(); // This will print the values assigned through parameterized constructor
        }
}