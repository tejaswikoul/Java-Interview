package oops;

class Shape {
    void area() {
        System.out.println("Drawing a Shape!");
    }
}

class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Draws a Circle.");
    }
}

class Rectangle extends Shape{
    @Override
    void area() {
        System.out.println("Draws a Rectangle.");
    }
}

public class ShapePolymorphism{
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.area();

        Rectangle rectangle = new Rectangle();
        rectangle.area();

        Shape circle = new Circle();
        circle.area();
    }
}