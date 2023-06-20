import java.util.Scanner;



public class Lab7Recursion {

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	static void question9(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a real number: ");
		int num = input.nextInt();
		System.out.print("Enter power: ");
		int power = input.nextInt();
		System.out.println("Result is " + power (num, power));
	}
	public static int power(int n, int p){
		if ( p == 0) return 1;
		else return n * power(n , p-1);
	}

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	static void question10(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter non negative number to print pattern 1: ");
		int n1 = input.nextInt();
		printPattern1(n1, n1+1);
		System.out.println();
		System.out.print("Enter non negative number to print pattern 2: ");
		int n2 = input.nextInt();
		printPattern2(n2, n2+1);
		System.out.println();
		System.out.print("Enter non negative number to print pattern 3: ");
		int n3 = input.nextInt();
		printPattern3(n3, n3+1);
		System.out.println();
		System.out.print("Enter non negative number to print pattern 4: ");
		int n4 = input.nextInt();
		printPattern4(n4);
//Q10PartA
		System.out.println();
		System.out.println("Question 10 Part A");
		System.out.println("Enter sequence of integers: ");
		int seq = input.nextInt();
		System.out.println("Reverse order is ");
		reverse(seq);
//Q10PartB
		System.out.println();
		System.out.println("Question 10 Part B");
		System.out.println("Enter integer number to find binary: ");
		int num = input.nextInt();
		System.out.println("Binary number of " + num + " is " + binary(num));
//Q10PartC
		System.out.println();
		System.out.println("Question 10 Part C");
		int array[] = {5, 10, 9, 8, 1};
		System.out.println("Enter integer to find index in Array ");
		int x = input.nextInt();
		int low = 0;
		int binsearch = binarySearch(array, low, array.length - 1, x);
		if (binsearch == -1) System.out.println(x + " is not present");
		else System.out.println("Index of " + x + " is " + binsearch);
	}
	//Pattern1
	public static void printPattern1(int n, int x){
		if(n>=1){
			printSpace1(n);
			printStar1(n, x);
			System.out.println();
			printPattern1(n-1, x);}
	}
	public static void printSpace1(int n){
		if ((n-1)>=1){System.out.print(" ");printSpace1(n-1);}
	}
	public static void printStar1(int n, int x){
		if(x-n>=1){System.out.print("* ");printStar1(n+1, x);}
	}


	//Pattern2
	public static void printPattern2(int n, int x){
		if(n>=1){
			printSpace2(n);
			printStar2(n, x);
			System.out.println();
			printPattern2(n-1, x);}
	}
	public static void printSpace2(int n){if (n>=1){System.out.print(" ");printSpace2(n-1);}}
	public static void printStar2(int n, int x){if(x-n>=1){System.out.print("*"); printStar2(n+1, x);}}

	//Pattern3
	public static void printPattern3(int n, int x){
		if (n>0){printStar3(n, x);
			System.out.println();
			printPattern3(n-1, x);}
	}
	public static void printStar3(int n, int x){
		if (x-n>=1){System.out.print("*");printStar3(n+1, x);}
	}
	//Pattern 4
	public static void printPattern4(int n){
		if (n>0){
			printStar4(n);
			System.out.println();
			printPattern4(n-1);}
	}
	public static void printStar4(int n){
		if (n>0){System.out.print("*");printStar4(n-1);}
	}

	//Method Part A reverse
	public static void reverse(int seq){
		if (seq < 10){System.out.println(seq);return;  }
		else {System.out.print(seq % 10);reverse(seq / 10);}}

	//Method Part B Binary
	public static int binary(int num){
		if (num == 0) return 0;
		else return (num % 2 + 10 * binary(num / 2));
	}
	//Method Binary Search
	public static int binarySearch(int array[], int low, int leng, int x){
		if (leng >= low){
			int mid = low + (leng - 1) / 2;
			if (array[mid] == x) return mid;
			if (array[mid] > x) return binarySearch(array, low, mid - 1, x);	//present in left side
			return binarySearch(array, mid + 1, leng, x);	//present in right side
		}
		return -1;
	}
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	public static void main(String[] args){
		question9();
		question10();
	}
}