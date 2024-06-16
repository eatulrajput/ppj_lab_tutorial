// Define a Java class BoolPattern with three Boolean member variables: A, B, and C. Using
// method overloading, generate binary patterns for one, two, and three Boolean variables. For
// instance, the output should be: Binary patterns for one variable {0, 1} Binary patterns for two
// variables {00, 01, 10, 11} Binary patterns for three variables {000, 001, 010, 011, 100, 101, 110,
// 111}

class BoolPattern {
    private boolean A;
    private boolean B;
    private boolean C;
    
    BoolPattern() {
    A = B = C = false;
    }
    
    void generatePatterns() {
    System.out.println("Binary patterns for one variable");
    System.out.println("{" + (A ? 1 : 0) + ", " + (!A ? 1 : 0) + "}");
    }
    
    void generatePatterns(boolean A, boolean B) {
    System.out.println("Binary patterns for two variables");
    System.out.println("{"
    + (A ? 1 : 0) + "" + (B ? 1 : 0) + ", "
    + (A ? 1 : 0) + "" + (!B ? 1 : 0) + ", "
    + (!A ? 1 : 0) + "" + (B ? 1 : 0) + ", "
    + (!A ? 1 : 0) + "" + (!B ? 1 : 0) + "}");
    }
    
    void generatePatterns(boolean A, boolean B, boolean C) {
    System.out.println("Binary patterns for three variables");
    System.out.println("{"
    + (A ? 1 : 0) + "" + (B ? 1 : 0) + "" + (C ? 1 : 0) + ", "
    + (A ? 1 : 0) + "" + (B ? 1 : 0) + "" + (!C ? 1 : 0) + ", "
    + (A ? 1 : 0) + "" + (!B ? 1 : 0) + "" + (C ? 1 : 0) + ", "
    + (A ? 1 : 0) + "" + (!B ? 1 : 0) + "" + (!C ? 1 : 0) + ", "
    + (!A ? 1 : 0) + "" + (B ? 1 : 0) + "" + (C ? 1 : 0) + ", "
    + (!A ? 1 : 0) + "" + (!B ? 1 : 0) + "" + (C ? 1 : 0) + ", "
    + (!A ? 1 : 0) + "" + (B ? 1 : 0) + "" + (!C ? 1 : 0) + ", "
    + (!A ? 1 : 0) + "" + (!B ? 1 : 0) + "" + (!C ? 1 : 0) + "}");
    }
    }
    
    class SecondProgram {
    public static void main(String[] args) {
    System.out.println("Name: Atul Rajput");
    System.out.println("Roll No.: 2230158");
    System.out.println();
    BoolPattern boolPattern = new BoolPattern();
    
    boolPattern.generatePatterns();
    
    boolPattern.generatePatterns(true, false);
    boolPattern.generatePatterns(true, false, true);
    }
    }