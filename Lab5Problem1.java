// Modify the Java program shown in Listing 5.1 to do the following:

// 1. Add a function void gender() to class Person that prints the state-
// ment “Gender is...”

// 2. Add a function void branch() to class Student that prints the state-
// ment “Branch is ECSC”.

class Person {
    void name() {
    System.out.println("Name is ...");
    }
    void gender() {
    System.out.println("Gender is ...");
    }
    }
    class Student extends Person {
    void roll() {
    System.out.println("Roll is ...");
    }
    void branch() {
    System.out.println("Branch is ECSC");
    }
    }
    class FirstProgram {
    public static void main(String[] args) {
    System.out.println("Name: Atul Rajput");
    System.out.println("Roll No.: 2230158");
    System.out.println();
    Student stud = new Student();
    stud.roll();
    
    stud.name();
    stud.gender();
    stud.branch();
    }
    }