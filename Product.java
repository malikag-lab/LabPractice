/*Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
 */
public class Product {
    String productName;
    int price;
    static int totalProducts;
    
    Product(String productName,int price){
        this.productName=productName;
        this.price=price;

        totalProducts++;
    }
    void displayProductDetails(){
         System.out.println("The Name of the Product is: "+productName+" and the Price of the product is: "+price);
    }
    static void displayTotalProducts(){
         System.out.println("Total number of Products: "+totalProducts);
    }
public static void main(String[] args) {
    

    Product obj=new Product("Laptop",50000 );
    Product obj2=new Product("Monitor",35000 );

    obj.displayProductDetails();
    obj2.displayProductDetails();
    Product.displayTotalProducts();

}    
}
