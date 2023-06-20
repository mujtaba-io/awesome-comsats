import java.util.Scanner;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer to find factorial: ");
        int fact = input.nextInt();
        int i = 0, mul = 1, a = fact;
        while (fact > i) {mul *= a;a -= 1;i += 1;}
        System.out.print("factorial of " + fact + " is: " + mul);
    }
}
