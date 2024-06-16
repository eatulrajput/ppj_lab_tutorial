// A complex number is of the form x + iy where x is the real part and y is an imaginary part of the
// number. Design a Java class called Complex representing the complex number with member data
// x and y of the number.
// Include constructors and member methods to perform the following:
// 1. to accept and display a complex number
// 2. to find the sum of two complex numbers

// 3. to find the product of two complex numbers

import java.util.*;
class Complex {
double x; // Real part
double y; // Imaginary part

// Constructor to accept a complex number
Complex(double real, double imag) {
x = real;
y = imag;
}

// Method to display a complex number
void displayComplex() {
System.out.println("Complex number: " + x + " + " + y + "i");
}

// Method to find the sum of two complex numbers
Complex add(Complex other) {
double sumReal = this.x + other.x;
double sumImag = this.y + other.y;

return new Complex(sumReal, sumImag);
}

// Method to find the product of two complex numbers
Complex multiply(Complex other) {
double productReal = this.x * other.x - this.y * other.y;
double productImag = this.x * other.y + this.y * other.x;
return new Complex(productReal, productImag);
}
}

class ComplexNumber {
public static void main(String[] args) {
System.out.println("");
System.out.println("Name: Atul Rajput");
System.out.println("Roll No.: 2230158");
System.out.println("");
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first complex number:");
System.out.print("Real part: ");
double real1 = sc.nextDouble();
System.out.print("Imaginary part: ");

double imag1 = sc.nextDouble();

System.out.println("Enter the second complex number:");
System.out.print("Real part: ");
double real2 = sc.nextDouble();
System.out.print("Imaginary part: ");
double imag2 = sc.nextDouble();

// Creating objects of the Complex class
Complex complex1 = new Complex(real1, imag1);
Complex complex2 = new Complex(real2, imag2);

// Displaying the entered complex numbers
complex1.displayComplex();
complex2.displayComplex();

// Finding and displaying the sum of two complex numbers
Complex sumResult = complex1.add(complex2);
System.out.println("Sum of the two complex numbers: ");
sumResult.displayComplex();

// Finding and displaying the product of two complex numbers
Complex productResult = complex1.multiply(complex2);

System.out.println("Product of the two complex numbers: ");
productResult.displayComplex();
}
}