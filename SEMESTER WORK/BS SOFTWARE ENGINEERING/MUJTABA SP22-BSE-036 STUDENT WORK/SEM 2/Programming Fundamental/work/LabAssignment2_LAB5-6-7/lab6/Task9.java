import java.util.Scanner;
public class Task9{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String Sentence = myObj.nextLine();
		int length = Sentence.length();
		int firstIndex = Sentence.indexOf('h');
		int lastIndex = Sentence.lastIndexOf('h');
		String sub = Sentence.substring(firstIndex+1,lastIndex-1);
		String newSentence = sub.replace('h','H');
		System.out.print(Sentence.substring(0,firstIndex+1) + newSentence +" "+  Sentence.substring(lastIndex,length));		
	}
}