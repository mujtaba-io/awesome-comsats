import java.util.Scanner;
public class Task1{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter point X1: ");
		double x1 = myObj.nextDouble();
		double y1 = myObj.nextDouble();
		System.out.print("Enter point X2: ");
		double x2 = myObj.nextDouble();
		double y2 = myObj.nextDouble();
		System.out.println("Point X1 is " + x1 + " "+  y1);
		System.out.println("Point X2 is " + x2 + " "+  y2);
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) +( Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.print("The distance between two points is "+ d);
	}
}