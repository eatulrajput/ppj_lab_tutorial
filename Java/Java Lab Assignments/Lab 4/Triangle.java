import java.util.Scanner;

 class Triangle {
    double a, b, c;

    // Constructor to accept the sides of a triangle
    Triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }

    // Method to display the sides of a triangle
    void displaySides() {
        System.out.println("Sides of the triangle: ");
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Side c: " + c);
    }

    // Method to determine the type of triangle
    void determineTriangleType() {
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else if (isRightAngledTriangle()) {
            System.out.println("Right-Angled Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    // Helper method to check if it's a right-angled triangle
    boolean isRightAngledTriangle() {
        double[] sides = { a, b, c };
        // Sorting the sides in ascending order
        java.util.Arrays.sort(sides);

        // Applying Pythagoras theorem to check for a right-angled triangle
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter side lengths
        System.out.print("Enter side a: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double sideC = scanner.nextDouble();

        // Creating an instance of the Triangle class with user-input side lengths
        Triangle userTriangle = new Triangle(sideA, sideB, sideC);

        // Displaying sides of the user-input triangle
        userTriangle.displaySides();

        // Determining the type of the user-input triangle
        userTriangle.determineTriangleType();

        scanner.close();
    }
}
