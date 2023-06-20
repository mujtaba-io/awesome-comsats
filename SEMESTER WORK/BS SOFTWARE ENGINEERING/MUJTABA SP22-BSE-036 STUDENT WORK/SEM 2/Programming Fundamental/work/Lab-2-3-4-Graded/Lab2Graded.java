
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

// MUHAMMAD MUJTABA SP22-BSE-036

// Note: I enclosed all activities in functions, otherwise too many files will be produced
// this makes it very difficult to handle.

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

class Lab2Graded {

    // Task 1:
    void task1(){
        int num1, num2, num3, average;
        num1 = 436, num2 = 64, num3 = -234;
        average = (num1 + num2 + num3) / 3;
        System.out.println(num1); System.out.println(num2);
        System.out.println(num3); System.out.println(average);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 2:
    void task2(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = console.nextInt();
        System.out.print("Enter the width: ");
        int width = console.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 3:
    void task3(){
        import java.util.Scanner;
        Scanner console = new Scanner(System.in);
        final int SECRET = 11; final double RATE = 12.50;
        int num1, num2, newNum; String name; double hoursWorked, wages;
        num1 = console.nextInt(); num2 = console.nextInt();
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
        newNum = num1 * 2 + num2;
        System.out.println("newNum is " + newNum);
        newNum += SECRET; System.out.println("newNum is " + newNum);
        name = console.next();
        System.out.print("Enter hours worked: ");
        hoursWorked = console.nextDouble();
        wages = hoursWorked * RATE;
        System.out.print("Name: %s\nPay Rate: %f\nHours Worked: %f\nSalary: %f\n", name, RATE, hoursWorked, wages);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    public static void main(String[] args){
        System.out.println("----- TASK 1 -----\n");
        task1();
        System.out.println("----- TASK 2 -----\n");
        task2();
        System.out.println("----- TASK 3 -----\n");
        task3();
    }
}

