import java.util.Scanner;
public class Task6{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String Sentence = myObj.nextLine();
		System.out.println(Sentence);
		int length = Sentence.length();
		String sub = Sentence.substring(0,length);
				int firstIndex = sub.indexOf(' ');
		int lastIndex = sub.lastIndexOf(' ');
		System.out.print(sub.substring(firstIndex,length) + ' ' + sub.substring(0,firstIndex).trim());


	}
}