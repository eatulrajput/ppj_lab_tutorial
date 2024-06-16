import java.util.*;

class Lab2Program5 {
    public static void main(String[] args) {
	
	System.out.println();
        System.out.println("Student Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");

        Scanner sc = new Scanner(System.in);

        // Input the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        // Display the Fibonacci series
        System.out.println("Fibonacci Series:");

        int firstTerm = 0, secondTerm = 1;

        // Display the first two terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        // Generate and display the rest of the terms
        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            // Update firstTerm and secondTerm for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

	System.out.println();
        System.out.println("Student Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");

    }
}
