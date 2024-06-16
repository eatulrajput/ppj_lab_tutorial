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
    void year2() {
        System.out.println("2nd year ...");
    }
}

class ThirdYear extends Student {
    void year3() {
        System.out.println("3rd year ...");
    }
}

class FourthYear extends Student {
    void year4() {
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
        secondYearStudent.year2();

        ThirdYear thirdYearStudent = new ThirdYear();
        thirdYearStudent.year3();

        FourthYear fourthYearStudent = new FourthYear();
        fourthYearStudent.year4();
    }
}
