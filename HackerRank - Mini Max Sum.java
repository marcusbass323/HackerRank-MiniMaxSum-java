import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    //Sort array from lowest value to highest value
        Arrays.sort(arr);
        int Min = arr[0];
        int Max = arr[arr.length-1];
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        int newMin = sum - Min;
        int newMax = sum - Max;
        System.out.println(newMax+" "+newMin);
    // int result = Integer.parseInt(number);            
    // System.out.println(result);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
