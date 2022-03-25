package com.syntax.coding1;

import static java.lang.Math.PI;

public interface Shape {

    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{

    double radius=22;

    @Override
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of a circle with radius of "+radius+"  is "+area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of a circle with radius of "+radius+" is "+perimeter);
    }
}
class Square implements Shape{

    double sideLength=2.2;

    @Override
    public void calculateArea() {
        double area =sideLength*sideLength;
        System.out.println("Area of a square with a side length of "+sideLength+"  is "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter =4*sideLength;
        System.out.println("Perimeter of a square with a side length of "+sideLength+"  is "+perimeter);
    }

}
class ShapeTester{
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();
    }
}