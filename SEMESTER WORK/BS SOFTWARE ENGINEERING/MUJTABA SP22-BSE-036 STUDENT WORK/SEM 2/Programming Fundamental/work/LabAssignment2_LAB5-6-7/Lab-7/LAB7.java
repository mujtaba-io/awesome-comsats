
// - START

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

// NAME: MUHAMMAD MUJTABA SP22-BSE-036
// WORK: LAB 7 ACTIVITIES
// TEACHER: SIR RIZWAN RASHID

// NOTE:
// I wrote all lab activities in class Activities { }
//  and all graded activities in class Graded { }
//  then I tested all of these in class LAB7 { }
// which is our main class.

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


// ALL LAB ACTIVITIES HERE:


import java.util.*;
import java.io.*;

class Activities {


    // ACTIVITY . 1:
    public static int max(int num1, int num2){
        if (num1 == num2) return -1; // if both are equal?
        return num1 > num2 ? num1 : num2;
    }


    // ACTIVITY . 2:
    public static void printGrade(double score){
        if(score >= 90.0){ System.out.println('A'); }
        else if(score >= 80.0){ System.out.println('B'); }
        else if (score >= 70.0){ System.out.println('C'); }
        else if (score >= 60.0){ System.out.println('D'); }
        else { System.out.println('F'); }
    }


    // ACTIVITY . 3:
    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
     }


     // ACTIVITY . 4:
    public static double max(double num1, double num2){
        if (num1 == num2) return -1; // if both are equal?
        return num1 > num2 ? num1 : num2;
    }
    public static double max(double num1, double num2, double num3){
        return max(max(num1, num2), num3);
     }


     // ACTIVITY . 5:
     public static long factorial(int n){
        if (n == 0) return 1; // Base case
        else return n * factorial(n - 1); // Recursive call
    }


    // ACTIVITY . 6:
    public static long fib(long index) {
        if (index == 0) return 0; // Base case
        else if (index == 1) return 1; // Base case
        else return fib(index - 1) + fib(index - 2); // Reduction and recursive calls
    }

    // MAIN METHOD (FOR TESTING ALL FUNCTIONS, WILL BE CALLED IN ANOTHER CLASS):
    public static void test() {

        // ACTIVITY . 1 TEST:
        int i = 5, j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);


        // ACTIVITY . 2 TEST:
        System.out.print("The grade is ");
        printGrade(78.5);
        System.out.print("The grade is ");
        printGrade(59.5);


        // ACTIVITY . 3 TEST:
        // Declare and initialize variables
        int num1 = 1;
        int num2 = 2;
        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
        // Invoke the swap method to attempt to swap two variables
        swap(num1, num2);
        System.out.println("After invoking the swap method, num1 is" + num1 + " and num2 is " + num2);


        // ACTIVITY . 4,5,6 TEST:
        System.out.println(max(4.0,7.2,6.0));
        System.out.println(factorial(8));
        System.out.println(fib(8));
    }

}

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


// ALL GRADED ACTIVITIES HERE:

class Graded {


    // ACTIVITY . 1:
    public static int sumDigits(long n){
        int sum = 0;
        while (n != 0){ sum += n % 10; n /= 10; }
        return sum;
    }
    public static int reverse(int num){
        int reversed = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            reversed *= 10 + lastDigit;
            num /= 10; // remove last digit
        }
        return reversed;
    }


    // ACTIVITY . 2:
    public static boolean isPalindrome(int number){ return number == reverse(number); }


    // ACTIVITY . 3:
    public static void displaySortedNumbers(double x, double y, double z){
        double max = Math.max(x, Math.max(y, z));
        double min = Math.min(x, Math.min(y, z));
        double mid = x + y + z - max - min;
        System.out.printf("In order %f %f %f%n", min, mid, max);
    }


     // ACTIVITY . 4:
    public static int numberOfDaysInAYear(int year){ return 365; }


     // ACTIVITY . 5:
     public static int countLetters(String s){ return s.length(); }


    // ACTIVITY . 6:
    public static void capitalize(String s){
        StringBuilder str = new StringBuilder(s);
        char c = s.charAt(0);
        for (int i = 0; i < s.length() - 1; c = s.charAt(i)){
            if (i == 0){ str.setCharAt(i, Character.toUpperCase(c)); i++; continue; }
            if (Character.isAlphabetic(c) && (s.charAt(i - 1) == ' ')){ str.setCharAt(i, Character.toUpperCase(c)); }
            i++;
        }
        System.out.print(str);
    }


    // ACTIVITY . 7:
    public static void matNxN(int N){
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(" " + (int)(Math.random() * 2));
            }
            System.out.print('\n');
        }
    }

    // ACTIVITY . 8:
    public static int countVowels(String s){
        int n = 0;
        char c = s.charAt(0);
        for (int i = 0; i < s.length() - 1; c = s.charAt(i)){
            if (Character.toUpperCase(c) == 'A' || Character.toUpperCase(c) == 'E'
            || Character.toUpperCase(c) == 'I' || Character.toUpperCase(c) == 'O'
            || Character.toUpperCase(c) == 'U'){ n++; }
            i++;
        }
        return n;
    }


    // ACTIVITY . 9:
    public static int power(int A, int N){
        if(N <= 0) return 0;
        return A * (power(A, N - 1));
    }

    // ACTIVITY . 10: *** DIFFICULT *** DIFFICULT *** DIFFICULT ***
    // USE RECURSION HERE, LEFT FOR LATER
    public static void patterns_reverse_int2bin_binSearch(){
        // -
    }

    public static void test(){
        System.out.println(sumDigits(123));
        System.out.println(reverse(123));
        System.out.println(isPalindrome(121));
        displaySortedNumbers(4.0, 1.0, 76.0);
        System.out.println(numberOfDaysInAYear(2022));
        System.out.println(countLetters("Hi, My name is Mujtaba."));
        capitalize("hi, my name is mujtaba.");
        matNxN(4);
        System.out.println(countVowels("hi, my name is mujtaba."));
        System.out.println(power(2,4));
    }

}


// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


// Main class:

public class LAB7 {
    public static void main(String [] args){
        Activities.test();
        Graded.test();
    }
}

// - END
