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
