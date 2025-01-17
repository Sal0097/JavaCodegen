//implement shapes program using interfaces 3-12-24

package Practice11;

import java.util.*;

// Define an interface
interface Shape {
    void collectData();
    void calculate();
    void display();
}

// Implement the interface in Circle class
class INCircle implements Shape {
    private double radius;
    private final double pi = 3.14768;
    private double area;

    @Override
    public void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = pi * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Area of the Circle: " + area);
    }
}

// Implement the interface in Rectangle class
class INRectangle implements Shape {
    private double length;
    private double breadth;
    private double area;

    @Override
    public void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = length * breadth;
    }

    @Override
    public void display() {
        System.out.println("Area of the Rectangle: " + area);
    }
}

// Implement the interface in Square class
class INSquare implements Shape {
    private double side;
    private double area;

    @Override
    public void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        side = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = side * side;
    }

    @Override
    public void display() {
        System.out.println("Area of the Square: " + area);
    }
}

// Geometry class to handle shapes
class INGeometry {
    void permit(Shape ref) {
        ref.collectData();
        ref.calculate();
        ref.display();
    }
}

public class InterfaceShapes {
    public static void main(String[] args) {
        INCircle c = new INCircle();
        INRectangle r = new INRectangle();
        INSquare s = new INSquare();

        INGeometry g = new INGeometry();

        System.out.println("Circle Details:");
        g.permit(c);
        System.out.println("================");

        System.out.println("Rectangle Details:");
        g.permit(r);
        System.out.println("================");

        System.out.println("Square Details:");
        g.permit(s);
        System.out.println("================");
    }
}
