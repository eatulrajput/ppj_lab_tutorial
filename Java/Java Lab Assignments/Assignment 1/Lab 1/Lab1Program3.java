import java.util.*;
class Lab1Program3 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("Student Name: Atul Rajput");
		System.out.println("Roll No.: 2230158");
		System.out.println();
        		double Length, Breadth, Perimeter, Area;
           		Scanner sc = new Scanner(System.in);
        		System.out.print("Enter length of the rectangle: ");
        		Length = sc.nextDouble();
		System.out.print("Enter breadth of the rectangle: ");
        		Breadth = sc.nextDouble();
        		Perimeter = 2 * (Length + Breadth );
		Area = (Length * Breadth);
		System.out.print("The length of the rectangle is: " + Length);
		System.out.println(" m");
		System.out.print("The breadth of the rectangle is: " + Breadth);
		System.out.println(" m");
		System.out.print("The perimeter of the rectangle is: " + Perimeter);
		System.out.println(" m");
		System.out.print("The area of the rectangle is: " + Area);
		System.out.println(" sq. m"); 
		System.out.println();
		System.out.println("Student Name: Atul Rajput");
		System.out.println("Roll No.: 2230158");
	}
}
