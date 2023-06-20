import java.util.Scanner;
public class Task8{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String sentence = myObj.nextLine();
		int length = sentence.length();
		int firstindex = sentence.indexOf('h');
		int lastIndex = sentence.lastIndexOf('h');
		System.out.print(sentence.substring(0,firstindex)+sentence.substring(lastIndex+1,length));
	}
}