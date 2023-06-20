import java.util.Scanner;
public class Task2{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number from (0 -- 127): ");
		int Character = myObj.nextInt();
		char alphabet = (char)Character;
		System.out.print("The Character for ascii Code "+ Character + " is: " + alphabet);

		System.out.print("Enter an alphabet: ");
		String string = myObj.next();
		char alpha; 
		System.out.print(alpha);
	}
}