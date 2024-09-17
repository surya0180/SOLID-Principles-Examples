package Principles.OpenClosed;

/**
 * Even the Shape class is
 * having properties that are not present for some other shapes.
 */
class IncorrectShape {
    String type;
    int height;
    int width;
    int radius;
}

/**
 *  Clearly this class is getting modified each time a new shape is required.
 *  Maintainability is not possible for this code.
 *  We need to extend from a certain base class inorder to create new shapes.
 *  This is where 'Open for Extension and Closed for Modification Principle' comes into picture
 * */
public class IncorrectShapeCalculator {
    public void calculateArea(IncorrectShape shape) {
        if(shape.type.equals("Square")) {
            System.out.println("Area is: " + (shape.height * shape.height));
        } else if(shape.type.equals("Rectangle")) {
            System.out.println("Area is: " + (shape.height * shape.width));
        } else if(shape.type.equals("Circle")) {
            System.out.println("Area is: " + (3.14 * shape.radius * shape.radius));
        }
    }
    public void calculatePerimeter(IncorrectShape shape) {
        if(shape.type.equals("Square")) {
            System.out.println("Perimeter is: " + (4*shape.height));
        } else if(shape.type.equals("Rectangle")) {
            System.out.println("Perimeter is: " + (2*(shape.height + shape.width)));
        } else if(shape.type.equals("Circle")) {
            System.out.println("Perimeter is: " + (2 * 3.14 * shape.radius));
        }
    }
}
