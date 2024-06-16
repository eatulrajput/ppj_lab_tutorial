// Write a Java program to print the following on the console: “Name” 
// “Roll number” 
// “Branch” 
// “Department” 
// “University” 


import java.util.*; 
class Lab1Program1 
{ 
public static void main(String[] args) 
{ 
System.out.println(); 
System.out.println("Student Name: Atul Rajput"); System.out.println("Roll No.: 2230158"); 
System.out.println();
int Roll; 
String Name, Branch, Department, University; 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter your Name: "); 
Name = sc.nextLine(); 
System.out.print("Enter your Roll No.: "); 
Roll = sc.nextInt(); 
sc.nextLine(); // Consume the newline character left by nextInt() System.out.print("Enter your Branch name: "); 
Branch = sc.nextLine(); 
System.out.print("Enter your Department name: "); Department = sc.nextLine(); 
System.out.print("Enter your University Name: "); University = sc.nextLine(); 
System.out.println(); 
System.out.println("The details are as follows: "); System.out.println(); 
System.out.println("Your Name is " + Name); 
System.out.println("Your Roll No. is " + Roll); 
System.out.println("Your Branch is " + Branch); 
System.out.println("Your Department is " + Department); System.out.println("Your University Name is " + University); System.out.println();
System.out.println("Student Name: Atul Rajput"); 
System.out.println("Roll No.: 2230158"); 
} 
} 
