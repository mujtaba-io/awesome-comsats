import java.util.Scanner;
public class Task10{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String sentence = myObj.nextLine();
		System.out.println(sentence.charAt(2));
		int length = sentence.length();
		System.out.println(sentence.charAt(length-1));
		for (int i = 0 ; i < length; i++) {System.out.print(sentence.charAt(i));}
		System.out.println();
		for(int i = 0;i<length-2;i++){System.out.print(sentence.charAt(i));}
		System.out.println();
		for (int i = 0;i<length;i++) {
			if(i % 2 != 0){continue;}
			else{System.out.print(sentence.charAt(i));}
		}
		System.out.println();
		for (int i = 0;i<length;i++) {
			if(i % 2 == 0){continue;}
			else{System.out.print(sentence.charAt(i));}
		}
		System.out.println();
		for (int i = (length-1);i>=0;i--) {System.out.print(sentence.charAt(i));}
		System.out.println();
		for (int i = (length-1);i>=0;i--) {
			if (i % 2 != 0) {continue;}
			else System.out.print(sentence.charAt(i));
		}
		System.out.println();
		System.out.println(length);
	}
}