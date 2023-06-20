
// CLASS ASSIGNMENT 4

// MUJTABA SP22-BSE-036
// SIR RIZWAN RASHID
// PROGRAMMING FUNDAMENTALS
// DATE: JAN 2, 2023

// START -
/*
public class Code {

    // QUESTION . 1
    static boolean isLeapYear(int year){
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
    static boolean isDateValid(int day, int month, int year){
        if(year < 0) return false; // BCs are not supported
        if(month < 1 || month > 12) return false;
        if(isLeapYear(year)){ if(month == 2) if(day < 1 || day > 29) return false; }
        else { if(month == 2) if(day < 1 || day > 28) return false; }
        if(month % 2 == 0){ if(day < 1 || day > 30) return false; }
        else { if(day < 1 || day > 31) return false; }
        return true;
    }

    // QUESTION . 2
    static boolean isPerfectNumber(int n){
        int i = 1, sum = 0;
        while(i <= n/2){ if(n % i == 0){ sum += i; } i++; }
        if (sum != n) return false;
        return true;
    }

    // QUESTION . 3
    static String dayOfTheWeek(int day){
        switch(day){
            case 1: return "MO";
            case 2: return "TU";
            case 3: return "WE";
            case 4: return "TH";
            case 5: return "FR";
            case 6: return "SA";
            case 7: return "SU";
            default: break;
        }
        return "NIL";
    }

    static void assertTrue(String fname, boolean condition){
        System.out.println(fname + ": " + condition);
    }
    static void assertEquals(String fname, String s0, String s1){
        System.out.println(fname + ": " + s0.equals(s1));
    }

    // MAIN
    public static void main(String[] args){
        assertTrue("isDateValid", isDateValid(14,2344,2342));
        assertTrue("isDateValid", isDateValid(1,2,23));
        assertTrue("isDateValid", isDateValid(29,2,1000));

        assertTrue("isPerfectNumber", isPerfectNumber(14));
        assertTrue("isPerfectNumber", isPerfectNumber(3));
        assertTrue("isPerfectNumber", isPerfectNumber(1024));

        assertEquals("dayOfTheWeek", dayOfTheWeek(0), "NIL");
        assertEquals("dayOfTheWeek", dayOfTheWeek(7), "SU");
        assertEquals("dayOfTheWeek", dayOfTheWeek(1), "MO");
    }
}

// - END
 */


// LAB ASSIGNMENT

// MUJTABA SP22-BSE-036
// SIR RIZWAN RASHID
// PROGRAMMING FUNDAMENTALS
// DATE: JAN 3, 2023

// START -

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code {

    // LAB 11
    // Q. 1
    static int awaitInt(){
        Scanner scn = new Scanner(System.in);
        String msg = "enter int: ";
        for(;;){
            System.out.println(msg);
            try { int in = scn.nextInt(); break; }
            catch(InputMismatchException e){ msg = "re-" + msg; }
        }
    }
    static void question1(){ System.out.println(awaitInt() + awaitInt()); }

    // Q . 2
    static void question2(){
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10]; int index = 0;
        String msg = "enter index: ";
        for(int i = 0; i < arr.length; i++) arr[i] = awaitInt();
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter index 0-9 to print value from arr:");
            try { index = scn.nextInt(); break; }
            catch(InputMismatchException e){ msg = "re-" + msg; }
        }
        System.out.println(arr[index]);
    }

    // LAB 13
    //  Q . 1
    static void _question1(){
        for(int i = 0; i < arr.length; i++) arr[i] = awaitInt();
        try {
            FileWriter wr = new FileWriter("TEST.TXT", true);
            for(int e: arr) wr.write(e);
            wr.close();
        } catch (IOException e){ }
    }

    // Q . 2
    static void _question2(){
        for(int i = 0; i < arr.length; i++) arr[i] = awaitInt();
        Arrays.sort(arr);
        try {
            FileWriter wr = new FileWriter("TEST.TXT", true);
            for(int e: arr) wr.write(e);
            wr.close();
        } catch (IOException e){ }
    }

    public static void main(String[] args){
         question1();  question2();
        _question1(); _question2();
    }
}

// - END
