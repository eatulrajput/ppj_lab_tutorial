// Create a Java class called uniMember which has instance-variables name and gender. Within this class, create two more classes, Student with instance-variable roll number and Faculty with instance-variable employee id. Write the Java methods to enter the details (name, gender, roll number, employee id) of a student and a faculty and display the same on the console. 

import java.util.Scanner; 
class UniMember { 
String name; 
String gender; 
UniMember(String name, String gender) { 
this.name = name;
this.gender = gender; 
} 
void displayDetails() { 
System.out.println("Name: " + name); 
System.out.println("Gender: " + gender); } 
} 
class Lab3Program3 { 
public static void main(String[] args) { 
System.out.println(""); 
System.out.println("Name: Atul Rajput"); System.out.println("Roll No. 2230158"); System.out.println(""); 
Scanner sc = new Scanner(System.in); 
// Input details for a student 
System.out.println("Enter details for a student:"); System.out.print("Name: "); 
String studentName = sc.nextLine(); 
System.out.print("Gender: "); 
String studentGender = sc.nextLine();
System.out.print("Roll Number: "); 
int rollNumber = sc.nextInt(); 
UniMember student = new UniMember(studentName, studentGender); StudentDetails studentDetails = new StudentDetails(student, rollNumber); 
// Input details for a faculty 
System.out.println("\nEnter details for a faculty:"); 
sc.nextLine(); // Consume the newline character 
System.out.print("Name: "); 
String facultyName = sc.nextLine(); 
System.out.print("Gender: "); 
String facultyGender = sc.nextLine(); 
System.out.print("Employee ID: "); 
int employeeId = sc.nextInt(); 
UniMember faculty = new UniMember(facultyName, facultyGender); FacultyDetails facultyDetails = new FacultyDetails(faculty, employeeId); 
// Display details 
System.out.println("\nStudent Details:"); 
studentDetails.displayDetails();
System.out.println("\nFaculty Details:"); 
facultyDetails.displayDetails(); 
System.out.println(""); 
System.out.println("Name: Atul Rajput"); 
System.out.println("Roll No. 2230158"); 
} 
} 
class StudentDetails { 
UniMember uniMember; 
int rollNumber; 
StudentDetails(UniMember uniMember, int rollNumber) { this.uniMember = uniMember; 
this.rollNumber = rollNumber; 
} 
void displayDetails() { 
uniMember.displayDetails(); 
System.out.println("Roll Number: " + rollNumber); }
} 
class FacultyDetails { 
UniMember uniMember; 
int employeeId; 
FacultyDetails(UniMember uniMember, int employeeId) { this.uniMember = uniMember; 
this.employeeId = employeeId; 
} 
void displayDetails() { 
uniMember.displayDetails(); 
System.out.println("Employee ID: " + employeeId); } 
}
