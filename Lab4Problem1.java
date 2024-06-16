// Create a class by name Triangle with the three sides a, b, and c as its member data. Include constructors and member methods to perform the following: 
// 1. to accept the sides of a triangle. 
// 2. to display the sides of a triangle. 
// 3. to find whether the triangle is an equilateral or an isosceles or right angled triangle. 

import java.util.*;

class Triangle {
    private double a, b, c;

    // Constructor to accept the sides of a triangle
    Triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }

    // Method to display the sides of a triangle

public void displaySides() {
System.out.println("Triangle sides: a = " + a + " units, b = " + b + " units, c = " + c + "
units");
}

    // Method to determine the type of triangle
    void determineTriangleType() {
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else if (isRightAngledTriangle()) {
            System.out.println("Right Angled Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    // Helper method to check if the triangle is right-angled
    boolean isRightAngledTriangle() {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}

class IdentifyTriangle {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        System.out.print("Side a: ");
        double sideA = sc.nextDouble();

        System.out.print("Side b: ");
        double sideB = sc.nextDouble();

        System.out.print("Side c: ");
        double sideC = sc.nextDouble();

        // Creating an object of the Triangle class
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        // Displaying the sides of the triangle
        triangle.displaySides();

        // Determining and displaying the type of triangle
        triangle.determineTriangleType();
    }
}
