import java.util.*;
 class Lab2Program2
{

        public static void main(String[] args)
        {
            System.out.println();
            System.out.println("Student Name: Atul Rajput");
            System.out.println("Roll No.: 2230158");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = sc.nextDouble();

            double largest;

            if (num1 > num2) {
                if (num1 > num3) {
                    largest = num1;
                } else {
                    largest = num3;
                }
            } else {
                if (num2 > num3) {
                    largest = num2;
                } else {
                    largest = num3;
                }
            }

            System.out.println("The largest number is: " + largest);
            System.out.println();
            System.out.println("Student Name: Atul Rajput");
            System.out.println("Roll No.: 2230158");
        }
    }