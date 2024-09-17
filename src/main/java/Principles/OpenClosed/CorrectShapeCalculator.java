package Principles.OpenClosed;

/**
 * This interface tells us how the Shape class should be implemented
 */
interface CorrectShape {
    public void calculateArea();
    public void calculatePerimeter();
}

/**
 * These classes implement the CorrectShape class and
 * have its own properties and logic to calculate the area
 * and perimeter.
 */
class Square implements CorrectShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public void calculateArea() {
        System.out.println("Area of square is: " + side * side);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of square is: " + 4*side);
    }
}

class Rectangle implements CorrectShape {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area of rectangle is: " + length * breadth);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of rectangle is: " + 2*(length + breadth));
    }
}

class Circle implements CorrectShape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area of circle is: " + 3.14*radius*radius);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of circle is: " + 2*(3.14*radius));
    }
}

/**
 * This code is not Open for extension since we are implementing the
 * shapes from an interface, but closed for modification since we are
 * modifying the CorrectShape interface for any purpose
 */
public class CorrectShapeCalculator {
    public static void main(String[] args) {
        CorrectShape square = new Square(5);
        CorrectShape circle = new Circle(4);
        CorrectShape rectangle = new Rectangle(4, 5);

        square.calculateArea();
        square.calculatePerimeter();
        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
