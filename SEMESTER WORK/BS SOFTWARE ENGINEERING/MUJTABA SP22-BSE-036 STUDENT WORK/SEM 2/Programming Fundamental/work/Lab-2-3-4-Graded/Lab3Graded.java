
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

// MUHAMMAD MUJTABA SP22-BSE-036

// Note: I enclosed all activities in functions, otherwise too many files will be produced
// this makes it very difficult to handle.

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

class Lab2Graded {

    // Task 1:
    void task1(){
        import java.util.Scanner;
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        int cents = (int)amount * 100;
        double dollars = (double)cents / 100;
        double remaining_cents = dollars % 100;
        double dimes = remaining_cents % 10;
        double nickels = dimes % 10;
        System.out.println("Pennies: ", remaining_cents);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 2:
    void task2(){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), K = s.nextInt();
        System.out.println("N\tK");
        System.out.println("%d\t%d", N, K);
        System.out.println("%d\t%d", K / N, K % N);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 3:
    void task3(){
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt(), s2 = s.nextInt(), s3 = s.nextInt();
        int smallest_desks = (s1+s2+s3) / 2;
        System.out.println(smallest_desks);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 4:
    void task4(){
        int N = 150;
        int hours = N / 60; // ?
        int minutes = N & 60; // ?
        System.out.println(hours);
        System.out.println(minutes);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 5:
    void task5(){
        Scanner s = new Scanner(System.in);
        double milkProduced = s.nextDouble();
        int cartons = (int)(milkProduced / 3.78);
        double cost = milkProduced * 0.38;
        double profit = cost * 0.27;
        System.out.println(cartons);
        System.out.println(cost);
        System.out.println(profit);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 7:
    void task7(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char class_ = s.next().chatAt(0);
        if (class_ = 'A') System.out.println(20 * n);
        if (class_ = 'B') System.out.println(15 * n);
        if (class_ = 'C') System.out.println(5 * n);

    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 8:
    void task8(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
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

