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
