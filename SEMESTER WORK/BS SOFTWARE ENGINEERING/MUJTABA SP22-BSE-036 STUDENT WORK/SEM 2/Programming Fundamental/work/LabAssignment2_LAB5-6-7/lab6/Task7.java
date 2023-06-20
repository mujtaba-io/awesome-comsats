import java.util.Scanner;
public class Task7{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String word = myObj.next();
		int firstIndex = word.indexOf('f');
		int lastIndex = word.lastIndexOf('f');
		

		System.out.print("f occurs at indices " + firstIndex + ' ' +  lastIndex);

	}
}