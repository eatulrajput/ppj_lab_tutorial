import java.util.*;


// Rectangle class
class Rectangle {
    // Attributes
    double length;
    double width;

    // Parameterized constructor
     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
     double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
     double calculatePerimeter() {
        return 2 * (length + width);
    }
}

 class RectangleCalculator {
    public static void main(String[] args) {

        System.out.println("");
	System.out.println("Name: Atul Rajput");
	System.out.println("Roll No. 2230158");
	System.out.println("");

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get user input for length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Create a Rectangle object using the user input
        Rectangle myRectangle = new Rectangle(length, width);

        // Calculate and display the area
        double area = myRectangle.calculateArea();
        System.out.print("Area of the rectangle: " + area);
	System.out.println(" sq. m");

        // Calculate and display the perimeter
        double perimeter = myRectangle.calculatePerimeter();
        System.out.print("Perimeter of the rectangle: " + perimeter);
	System.out.println(" m");
	System.out.println("");
	System.out.println("Name: Atul Rajput");
	System.out.println("Roll No. 2230158");

    }
}
