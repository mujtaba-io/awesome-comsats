
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

// MUHAMMAD MUJTABA SP22-BSE-036

// Note: I enclosed all activities in functions, otherwise too many files will be produced
// this makes it very difficult to handle.

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

class Lab2Graded {

    // Task 1:
    void task1(){
        int x=10, y=15, z=20);
        System.out.println(!(x > 1 0));
        System.out.println(x <= 5 || y < 15;
        System.out.println((x != 5 ) && (y != z));
        System.out.println(x >= z || (x + y >= z));
        System.out.println((x <= y - 2) && (y >= z) || (z - 2 != 20));
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 2:
    void task2(){
        int  x = 3, y = 4, z = 7,and w =1;
        System.out.println("x == y: " + (x == y ));
        System.out.println("x != z: " + (x != z ));
        System.out.println("y == z – 3: " + (y == z - 3) );
        System.out.println("!(z > w): " + ! (z > w));
        System.out.println("x + y < z: " + (x + y < z));

    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 3: false

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    // Task 4:
    void task4(){
        int x = 3, y = 4;
        int min = x < y ? x : y;
        int sx;
        System.out.println("minimum: " + min);
        if(x < 0)sx = -1; if(x > 0)sx = 1;
        else sx = 0;
        System.out.println("sign of x: " + sx);
    }

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


    // Task 5:
    void task5(){
        int x = 3, y = 4, z = 4;
        if(x == y && z == y) System.out.println("ALL EQUAL");
        else if(x == y) System.out.println("x.y EQUAL");
        else if(z == y) System.out.println("z,y EQUAL");
        else System.out.println("NO EQUAL");
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

