import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, num, numbers, i = 0;
        System.out.print("How many number you want to enter? ");
        numbers = input.nextInt();
        System.out.println("");
        System.out.print("Enter " + numbers + " numbers: ");
        while (i < numbers) {
            num = input.nextInt();
            if (num == 0) {count += 1;}
            i += 1;
        }
        System.out.print("There are " + count + " Zero in the numbers");
    }
}