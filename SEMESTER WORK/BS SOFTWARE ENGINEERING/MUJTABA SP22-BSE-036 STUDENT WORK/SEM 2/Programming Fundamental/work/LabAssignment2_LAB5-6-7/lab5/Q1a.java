import java.util.Scanner;

public class Q1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = input.nextInt();
        System.out.print("Enter the ending number: ");
        int b = input.nextInt();
        int i = a;
        System.out.print(a);
        while (b > i) {
            i += 1;
            System.out.print(" " + i);
        }
    }
}
