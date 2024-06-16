// Using a multi-level inheritance, write a Java program to implement the
// relationship shown in Figure 5.1. Also, include constructors in every class to
// initialise the member variables.

class UniversityMember {
    String name;
    String gender;
    UniversityMember() {
    this.name = "";
    this.gender = "";
    }
    UniversityMember(String name, String gender) {
    this.name = name;
    this.gender = gender;
    
    }
    void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    }
    }
    class Student extends UniversityMember {
    String course;
    String branch;
    Student() {
    super();
    this.course = "";
    this.branch = "";
    }
    Student(String name, String gender, String course, String branch) {
    super(name, gender);
    this.course = course;
    this.branch = branch;
    }
    void displayInfo() {
    super.displayInfo();
    System.out.println("Course: " + course);
    System.out.println("Branch: " + branch);
    
    }
    }
    class Year extends Student {
    int yearID;
    int semID;
    double SGPA;
    Year() {
    super();
    this.yearID = 0;
    this.semID = 0;
    this.SGPA = 0.0;
    }
    Year(String name, String gender, String course, String branch, int yearID, int semID, double
    SGPA) {
    super(name, gender, course, branch);
    this.yearID = yearID;
    this.semID = semID;
    this.SGPA = SGPA;
    }
    void displayInfo() {
    super.displayInfo();
    System.out.println("Year ID: " + yearID);
    System.out.println("Semester ID: " + semID);
    System.out.println("SGPA: " + SGPA);
    
    }
    }
    class FourthProgram {
    public static void main(String[] args) {
    System.out.println("Name: Atul Rajput");
    System.out.println("Roll No.: 2230158");
    System.out.println();
    Year studentInfo = new Year("Atulya Singh", "Male", "BTech", "Computer Science", 2, 1,
    8.5);
    studentInfo.displayInfo();
    }
    }