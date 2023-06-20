
import java.io.*; import java.util.*;

public class Lab8 {

    public void rateFood(){
        int[] totalRatings = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.print("Rate the quality of food in your cafe (1-10).");
        for(int n = 0; n < 10; n++){
            System.out.print("Response . " + n + ": ");
            int rating = s.nextInt();
            totalRatings[n] = rating;
            System.out.print("\n");
        }
        int summary = 0;
        for(int n = 0; n < 10; n++){ summary += totalRatings[n]; }
        summary /= 10;
        System.out.print("Average food quality: ");
        System.out.print((summary > 5) ? "tastes good -)" : "awful :-(");
    }

    public void modify(int[] arr){
        for(int i = 0; i < arr.length(); i++) arr[i] *= 3;
    }

    public void reverseCopy(int[] from, int[] to){
        if(from.length() != to.length()) return ;
        for(int i = 0; i < from.length(); i++){
            to[to.length() - i] = from[i];
        }
    }

    public static void main(String[] args){
        rateFood();
        int[] arr = new int[10]; modify(arr);
        int[] A = {1,2,3}; int[] B = new int[3];
        reverseCopy(A, B);
        System.out.print("" + B[0] + " " + B[1] + " " + B[2]);
    }
}
