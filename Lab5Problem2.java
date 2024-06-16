// Modify the Java program shown in Listing 5.2 to do the following:
// 1. Add a class FirstSem that is an extension of class FirstYear. Add a function void subjects() to
// the class FirstSem that displays “6 theory courses and 2 lab courses”. Compile and run the
// program.
// Apply the concept of multilevel inheritance.
// 2. Add three more classes, SecondYear, ThirdYear, FourthYear which are extensions of class
// Student. Add three functions, void year2(), void year3(), void year4() to three new classes
// SecondYear, ThirdYear, FourthYear respectively. The function void year2() displays “2nd
// year...”, function void year3() prints “3rd year...”, and function void year4() shows “4th year...”
// Apply the concept of hierarchical inheritance.

class Person {

    void name() {
    System.out.println("Name is ...");
    }
    }
    class Student extends Person {
    void roll() {
    System.out.println("Roll is ...");
    }
    }
    class FirstYear extends Student {
    void year() {
    System.out.println("1st year ...");
    }
    }
    class FirstSem extends FirstYear {
    void subjects() {
    System.out.println("6 theory courses and 2 lab courses");
    }
    }
    class SecondYear extends Student {
    void year() {
    System.out.println("2nd year ...");
    }
    
    }
    class ThirdYear extends Student {
    void year() {
    System.out.println("3rd year ...");
    }
    }
    
    class FourthYear extends Student {
    void year() {
    System.out.println("4th year ...");
    }
    }
    
    class SecondProgram {
    public static void main(String[] args) {
    System.out.println("Name: Atul Rajput");
    System.out.println("Roll No.: 2230158");
    System.out.println();
    FirstSem stud = new FirstSem();
    stud.year();
    stud.roll();
    stud.name();
    stud.subjects();
    
    SecondYear secondYearStudent = new SecondYear();
    secondYearStudent.year();
    
    ThirdYear thirdYearStudent = new ThirdYear();
    thirdYearStudent.year();
    
    FourthYear fourthYearStudent = new FourthYear();
    fourthYearStudent.year();
    }
    }