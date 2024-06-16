// Create a Java program that defines a parent class called Student with two member variables:
// name and roll. Initialise these variables using a no-argument constructor and include a member
// method info() to print your name and roll number. Create three child classes: FirstSem,
// SecondSem, and ThirdSem, each extending the Student class. Each child class should have a
// member variable SGPA which is initialised in a no-argument constructor. Include a member
// method info() in all three child classes that prints the name, roll number and SGPA for all three
// semesters using inheritance and method overriding.

class Student {
    String name;
    int roll;
    
    Student() {
    name = "Atulya Singh";
    roll = 2230160;
    }
    
    void info() {
    System.out.println("Name: " + name);
    System.out.println("Roll: " + roll);
    }
    }
    
    class FirstSem extends Student {
    double SGPA;
    
    FirstSem() {
    SGPA = 8.8;
    }
    
    void info() {
    super.info(); // Call the parent class method
    System.out.println("SGPA (1st Semester): " + SGPA);
    }
    
    }
    
    class SecondSem extends Student {
    double SGPA;
    
    SecondSem() {
    SGPA = 8.7;
    }
    
    void info() {
    super.info(); // Call the parent class method
    System.out.println("SGPA (2nd Semester): " + SGPA);
    }
    }
    
    class ThirdSem extends Student {
    double SGPA;
    
    ThirdSem() {
    SGPA = 8.4;
    }
    
    void info() {
    
    super.info(); // Call the parent class method
    System.out.println("SGPA (3rd Semester): " + SGPA);
    }
    }
    
    class ThirdProgram {
    public static void main(String[] args) {
    System.out.println("Name: Atul Rajput");
    System.out.println("Roll No.: 2230158");
    System.out.println();
    FirstSem firstSemester = new FirstSem();
    SecondSem secondSemester = new SecondSem();
    ThirdSem thirdSemester = new ThirdSem();
    
    System.out.println("Information for First Semester:");
    firstSemester.info();
    
    System.out.println("\nInformation for Second Semester:");
    secondSemester.info();
    
    System.out.println("\nInformation for Third Semester:");
    thirdSemester.info();
    }
    
    }