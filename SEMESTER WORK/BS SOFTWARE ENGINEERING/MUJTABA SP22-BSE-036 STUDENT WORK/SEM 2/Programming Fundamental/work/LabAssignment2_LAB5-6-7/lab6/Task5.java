import java.util.Scanner;
public class Task5{
public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	System.out.print("Enter a Word: ");
	String word = myObj.next();
	int length = word.length();
	String newWord = "";
	for (int i = (length-1); i >= 0; i--) {
		char newChar = word.charAt(i);
		newWord += newChar;
	}
	if (word.equalsIgnoreCase(newWord)) {
		System.out.println("Palindrome");	
	}
	else{
		System.out.println("Not a Palindrome");
	}
	}
}