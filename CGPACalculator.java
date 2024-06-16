// Write a java program to calculate the CGPA of your semester.
import java.util.*;
class CGPACalculator {
int totalCredits;
double totalGradePoints;

// Constructor
CGPACalculator() {
totalCredits = 0;
totalGradePoints = 0.0;
}

// Method to add a course grade
void addCourseGrade(int credits, double gradePoint) {
totalCredits += credits;
totalGradePoints += (credits * gradePoint);
}

// Method to calculate CGPA
double calculateCGPA() {
if (totalCredits == 0) {
return 0.0; // Avoid division by zero
}
return totalGradePoints / totalCredits;
}

// Method to display CGPA
void displayCGPA() {
System.out.printf("CGPA: %.2f", calculateCGPA());

}
}

class CalculateCGPA {
public static void main(String[] args) {
System.out.println("");
System.out.println("Name: Atul Rajput");
System.out.println("Roll No.: 2230158");
System.out.println("");
Scanner sc = new Scanner(System.in);

// Creating an object of the CGPACalculator class
CGPACalculator cgpaCalculator = new CGPACalculator();

System.out.println("Enter the number of courses:");
int numCourses = sc.nextInt();

for (int i = 1; i <= numCourses; i++) {
System.out.println("Enter details for Course #" + i + ":");
System.out.print("Credits: ");
int credits = sc.nextInt();
System.out.print("Grade Point: ");
double gradePoint = sc.nextDouble();

// Adding course grade to the calculator
cgpaCalculator.addCourseGrade(credits, gradePoint);
}
// Displaying the calculated CGPA
cgpaCalculator.displayCGPA();
}
}