class Lab2Program1 {
    public static void main(String[] args) {
	System.out.println();
        System.out.println("Student Name: Atul Rajput");
	System.out.println("Roll No.: 2230158");
	System.out.println();
        System.out.print("x  ");
        for (double x = 0; x <= 1; x += 0.1) {
            System.out.printf("%.1f ", x);
        }

        System.out.println(); // Move to the next line for the values

        System.out.print("y ");
        for (double x = 0; x <= 1; x += 0.1) {
            double y = Math.exp(-x); // Calculate y = e^(-x)
            System.out.printf("%.4f ", y);
        }

	System.out.println();
	System.out.println();
        System.out.println("Student Name: Atul Rajput");
        System.out.println("Roll No.: 2230158");
    }
}
