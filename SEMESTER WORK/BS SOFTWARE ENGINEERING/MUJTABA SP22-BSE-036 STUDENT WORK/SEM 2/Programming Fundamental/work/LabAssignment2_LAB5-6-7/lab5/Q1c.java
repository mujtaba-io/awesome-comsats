import java.util.Scanner;

public class Q1c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, a, numbers, i = 0;
        System.out.print("How many number you want to enter? ");
        numbers = input.nextInt();
        System.out.println("");
        System.out.print("Enter " + numbers + " numbers: ");
        while (i < numbers) {a = input.nextInt();sum += a; i += 1; }
        System.out.print("The sum of all these numbers: " + sum);
    }
}