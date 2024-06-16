// Write a Java program to find the area and circumference of a circle, given its radius, r and use format specifiers. 


import java.util.*; 
class CircleCalculator 
{ 
public static void main(String[] args) 
{ 
System.out.println(); 
System.out.println("This program is related to circle calculation"); 
System.out.println(); 
System.out.println("Student Name: Atul Rajput"); 
System.out.println("Roll No.: 2230158"); 
System.out.println(); 
double Radius, Circumference, Area;
Scanner sc = new Scanner(System.in); 
System.out.print("Enter radius of the circle: "); 
Radius = sc.nextDouble(); 
Circumference = 2 * 3.14 * Radius; 
Area = 3.14 * Radius * Radius; 
System.out.printf("The radius of the circle is: %.2f", Radius); 
System.out.println(" m"); 
System.out.printf("The circumference of the circle is: %.2f", Circumference); System.out.println(" m"); 
System.out.printf("The area of the circle is: %.2f", Area); 
System.out.println(" sq. m"); 
System.out.println(); 
System.out.println("Student Name: Atul Rajput"); 
System.out.println("Roll No.: 2230158"); 
} 
}
