import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = 0, i = 0;
        System.out.println("Enter the sequence(0 to end): ");
        int num = input.nextInt();
        while (num != 0) {
            if (num >= check) {check = num;i += 1;}
            num = input.nextInt();
        }
        System.out.print("The index of largest number is: " + i);
    }
}