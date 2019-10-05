/* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five 
 * integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */

import java.util.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long max = Integer.MIN_VALUE, 
             min = Integer.MAX_VALUE, 
             length = arr.length, 
             sum = 0;

        for (int i = 0; i < length; i++) {
            long n = arr[i];
            max = Math.max(max, n);
            min = Math.min(min, n);
            sum += n;
        }
        System.out.println((sum - max) + " " + (sum - min));
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
