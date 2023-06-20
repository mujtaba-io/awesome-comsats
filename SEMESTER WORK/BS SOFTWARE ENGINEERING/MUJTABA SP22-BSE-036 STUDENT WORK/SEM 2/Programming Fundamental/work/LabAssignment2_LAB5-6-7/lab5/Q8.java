import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sequence(0 to end): ");
        int seq = input.nextInt();
        int check = 0, neighbor = 0;
        while (seq != 0) {
            seq = input.nextInt();
            if (seq > check) {neighbor += 1;}
            check = seq;
        }
        System.out.print("Number greater than its previous number is:" + neighbor);

    }
}
