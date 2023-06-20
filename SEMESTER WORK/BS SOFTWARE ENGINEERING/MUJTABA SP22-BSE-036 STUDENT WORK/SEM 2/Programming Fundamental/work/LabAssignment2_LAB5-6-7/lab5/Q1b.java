import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = input.nextInt();
        System.out.print("Enter the ending number: ");
        int b = input.nextInt();
        if (a < b) {
            int i = a;
            System.out.print(a);
            while (b > i) {i += 1;System.out.print(" " + i);}
        } else if (a > b) {
            int f = a;
            System.out.print(a);
            while (f > b) {f -= 1;System.out.print(" " + f);}
        } else { System.out.print("1st and 2nd number are same and no number is lie b/w them"); }
    }
}
