import java.util.*;

class Lab2Program3 {
    public static void main(String[] args) {
	 System.out.println();
         System.out.println("Student Name: Atul Rajput");
         System.out.println("Roll No.: 2230158");
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the point: ");
        double x = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the point: ");
        double y = sc.nextDouble();

System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculating the distance from the center of the circle
        double distance = Math.sqrt(x * x + y * y);

        // Checking the position of the point with respect to the circle
        if (distance < radius) {
            System.out.println("The point (" + x + ", " + y + ") lies inside the circle.");
        } else if (distance > radius) {
            System.out.println("The point (" + x + ", " + y + ") lies outside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") lies on the circle.");
        }
	
	 System.out.println();
         System.out.println("Student Name: Atul Rajput");
         System.out.println("Roll No.: 2230158");

    }
}
