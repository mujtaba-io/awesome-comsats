import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of sequence: ");
        int length = input.nextInt();
        int i = 0, seq, check = 0;
        System.out.println("Enter the sequence: ");
        while (length > i) {
            seq = input.nextInt();
            if (seq != 0) {check = i; }
            i += 1;
        }
        System.out.print("The lenght of sequence is: " + check);
    }
}
