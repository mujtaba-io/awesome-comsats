import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = 0;
        System.out.print("Enter any integer(0 to end): ");
        int num = input.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {check += 1;}
            System.out.print("Enter any integer(0 to end): ");
            num = input.nextInt();
        }
        System.out.print("Total even number : " + check);
    }
}
