import java.util.*;
class Lab1Program4 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("Student Name: Atul Rajput");
		System.out.println("Roll No.: 2230158");
		System.out.println();
        		int givenSecond, hour, minute, second;
           		Scanner sc = new Scanner(System.in);
        		System.out.print("Enter no. of seconds: ");
        		givenSecond = sc.nextInt();
		// Division operator is :  "/"
		// Modulus operator is : "%"
		// Modulus operator will give the value as it is if the dividend is smaller that divisor
		hour = givenSecond / 3600; // It will give 0 as Quotient if dividend is smaller because of int type.
		minute = (givenSecond % 3600) / 60;
		second = givenSecond % 60; 
		System.out.println("Equivalent time: " + hour + " hours, " + minute + " minutes, " + second + " seconds.");
		System.out.println();
		System.out.println("Student Name: Atul Rajput");
		System.out.println("Roll No.: 2230158");
	}
}
