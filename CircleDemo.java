/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
 */
class Circle {
    private double radius;

    
    Circle() {
        this(1.0); 
    }

    
    Circle(double radius) {
        this.radius = radius;
    }

    
    public void displayRadius() {
        System.out.println("Radius of the circle: " + radius);
    }
}


public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();      
        Circle c2 = new Circle(5.0);   

        c1.displayRadius();
        c2.displayRadius();
    }
}

