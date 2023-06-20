/*
int x, y;
x = 10 // missing semicolon (;)
z = x + y; // z is undefined, y in uninitialized.
func() // this function is never defined


int tmp = a / b; //where  a % b is expected.
system.out.print("success"); // where "error" is expected.
func(); // wherer calling foo() is expected

int myint = scanner.nextint(); // but user enters a string
int x = y / z; // but the value of z here is 0, so division by 0 occurs
array[11] = 5; // but index 11 is out of bounds of this array
*/
/*
public class code {
    public static void main(string[] args){
        final int prime = 1; // defined constant
        final int one = 1; // defined constant
        int count = 1; // corrected declaration with type int
        int sum = count + prime; // corrected declaration with type int
        double x = 25.67; // corrected declaration with type double
        int newnum = count * one + 2;
        sum += count; // corrected assignment
        x = x + (double)(sum * count); // casted type to prevent error
        system.out.println(" count = " + count + ", sum = "
                + sum + ", prime = " + prime);
    }
}*/

/*this program will calculate product of three numbers */
/*public class product {
    public static void main(string[] args) {
        int num1 = 10; // first number
        int num2 = 20; // second number
        int num3 = 1;// third number
        int result; //product of numbers
        result = num1 * num2 * num3;
        system.out.println("product of numbers: " + result);
    }
}
*/
/*
public class code {
    public static void main(string[] args) {
        int x, y;
        x = 10; char ch = 'b'; y = 1;
        x += 5; double payrate = 12.50;
        int firstnum = 100, tmpnum;
        tmpnum = firstnum;
        int s_tmp = x; x = y; y = s_tmp;
        system.out.print((double)x); system.out.print((double)y);
        system.out.print((double)(x+12/y-18));
        char grade = 'a'; int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
        x = (int)z;
    }
}
*/


/*
// calculates daily driving costs

import java.util.scanner;

public class code {
    public static void main(string[] args){
        scanner s = new scanner(system.in);
        system.out.print("enter miles per day: ");
        double milesperday = s.nextdouble();
        system.out.print("enter gasoline cost per gallon: ");
        double costpergallon = s.nextdouble();
        system.out.print("enter miles per gallon: ");
        double milespergallon = s.nextdouble();
        system.out.print("enter parking fee per day: ");
        double parkingfeeperday = s.nextdouble();
        system.out.print("enter tolls per day: ");
        double tollsperday = s.nextdouble();

        double costpermile = costpergallon / milespergallon;
        double totalcost = (costpermile * milesperday)
                + parkingfeeperday + tollsperday;
        system.out.print("your total driving cost per day is: "
                + totalcost);
    }
}
*/

import java.util.Scanner;

public class code {
    public static void main(string[] args){
        Scanner s = new scanner(system.in);
        system.out.print("enter a 5-digit number: ");
        int n = s.nextint();
        int reverse = 0;
        while(n != 0) {
            int remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n = n / 10;
        }
        system.out.println("the reverse number is: " + reverse);
    }
}




















































