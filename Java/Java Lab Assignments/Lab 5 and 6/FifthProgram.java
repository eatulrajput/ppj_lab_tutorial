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

class Employee extends UniversityMember {
    String employeeID;

    Employee() {
        super();
        this.employeeID = "";
    }

    Employee(String name, String gender, String employeeID) {
        super(name, gender);
        this.employeeID = employeeID;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
    }
}

class Year extends Student {
    int yearID;
    int semID;
    int rollNumber;
    double SGPA;

    Year() {
        super();
        this.yearID = 0;
        this.semID = 0;
        this.rollNumber = 0;
        this.SGPA = 0.0;
    }

    Year(String name, String gender, String course, String branch, int yearID, int semID, int rollNumber, double SGPA) {
        super(name, gender, course, branch);
        this.yearID = yearID;
        this.semID = semID;
        this.rollNumber = rollNumber;
        this.SGPA = SGPA;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year ID: " + yearID);
        System.out.println("Semester ID: " + semID);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("SGPA: " + SGPA);
    }
}

class Teaching extends Employee {
    String designation;

    Teaching() {
        super();
        this.designation = "";
    }

    Teaching(String name, String gender, String employeeID, String designation) {
        super(name, gender, employeeID);
        this.designation = designation;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
    }
}

class Nonteaching extends Employee {
    String designation;

    Nonteaching() {
        super();
        this.designation = "";
    }

    Nonteaching(String name, String gender, String employeeID, String designation) {
        super(name, gender, employeeID);
        this.designation = designation;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
    }
}

 class FifthProgram {
    public static void main(String[] args) {
	System.out.println("Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");
        System.out.println();
        Year studentInfo = new Year("Atulya Singh", "Male", "BTech", "Computer Science", 2, 1, 2230160, 8.5);
        studentInfo.displayInfo();

        Teaching teachingInfo = new Teaching("Swati Mishra", "Female", "T2024", "Professor");
        teachingInfo.displayInfo();

        Nonteaching nonteachingInfo = new Nonteaching("Prakash sharma", "Male", "NT2021", "Lab Assistant");
        nonteachingInfo.displayInfo();
    }
}
