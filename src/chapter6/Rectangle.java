package chapter6;

public class Rectangle {
    // class fields
    private double length; // code outside of the class cannot access these variables, must use getter and setter methods to access these variables
    protected double width;
    // protected variables can be accessed by other classes inside package, but not outside. similar to having no access modifier at all but more explicit

    // default constructor
    public Rectangle() {
        // default values for initialization
        length = 0;
        width = 0;
    }

    // constructor with parameters
    public Rectangle(double length, double width) {
        this.length = length; // can set by targeting variable
        setWidth(width); // or set using setter method
    }

    // setter and getter methods, made public so they can be utilized outside package
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    // class methods
    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    double calculateArea(){
        return length * width;
    }
}
