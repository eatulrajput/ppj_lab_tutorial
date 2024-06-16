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
