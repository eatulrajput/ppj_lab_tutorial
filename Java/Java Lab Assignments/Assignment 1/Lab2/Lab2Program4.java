import java.util.*;

class Lab2Program4 {
    public static void main(String[] args) {

	System.out.println();
        System.out.println("Student Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");

        Scanner sc = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of the cubes of each digit
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
	    System.out.println();
            System.out.println("Student Name: Atul Rajput");
            System.out.println("Roll No.: 2230158");
    }
}
