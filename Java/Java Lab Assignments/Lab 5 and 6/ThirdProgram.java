class Person {
    String name;
    
    Person() {
        this.name = "";
    }

    Person(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name is: " + name);
    }
}

class Student extends Person {
    int roll;

    Student() {
        super();
        this.roll = 0;
    }

    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll is: " + roll);
    }
}

class FirstYear extends Student {
    int year;

    FirstYear() {
        super();
        this.year = 0;
    }

    FirstYear(String name, int roll, int year) {
        super(name, roll);
        this.year = year;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}

class FirstSem extends FirstYear {
    String subjects;

    FirstSem() {
        super();
        this.subjects = "";
    }

    FirstSem(String name, int roll, int year, String subjects) {
        super(name, roll, year);
        this.subjects = subjects;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Subjects: " + subjects);
    }
}

class SecondYear extends Student {
    int year;

    SecondYear() {
        super();
        this.year = 0;
    }

    SecondYear(String name, int roll, int year) {
        super(name, roll);
        this.year = year;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}

class ThirdYear extends Student {
    int year;

    ThirdYear() {
        super();
        this.year = 0;
    }

    ThirdYear(String name, int roll, int year) {
        super(name, roll);
        this.year = year;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}

class FourthYear extends Student {
    int year;

    FourthYear() {
        super();
        this.year = 0;
    }

    FourthYear(String name, int roll, int year) {
        super(name, roll);
        this.year = year;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}

class ThirdProgram {
    public static void main(String args[]) {
	System.out.println("Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");
        System.out.println();
        FirstSem stud = new FirstSem("Raj", 159, 1, "6 theory courses and 2 lab courses");
        stud.displayInfo();

        SecondYear secondYearStudent = new SecondYear("Atulya", 160, 2);
        secondYearStudent.displayInfo();

        ThirdYear thirdYearStudent = new ThirdYear("Arya", 155, 3);
        thirdYearStudent.displayInfo();

        FourthYear fourthYearStudent = new FourthYear("Arkajyoti", 153, 4);
        fourthYearStudent.displayInfo();
    }
}
