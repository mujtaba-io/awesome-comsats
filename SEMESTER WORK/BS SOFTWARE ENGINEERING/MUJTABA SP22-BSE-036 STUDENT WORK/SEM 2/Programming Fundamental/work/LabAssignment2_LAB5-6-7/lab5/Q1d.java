import java.util.Scanner;

public class Q1d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, numbers, i = 1;
        System.out.print("Enter the numbers of which you need cubic sum: ");
        numbers = input.nextInt();
        while (i <= numbers) {sum += i * i * i;i += 1; }
        System.out.print("The cubic sum of first " + numbers + " these numbers: " + sum);
    }
}
