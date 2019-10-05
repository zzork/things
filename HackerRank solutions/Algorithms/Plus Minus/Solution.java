/* Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal 
 * value of each fraction on a new line.
 */

import java.util.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int size = arr.length, positive = 0, negative = 0, zero = 0;
        
        for (int n : arr) {
            if (n > 0) positive++;
            else if (n < 0) negative++;
            else zero++;
        }
        double pFraction = (double)positive/size, 
               nFraction = (double)negative/size, 
               zFraction = (double)zero/size;
        
        System.out.println(pFraction);
        System.out.println(nFraction);
        System.out.println(zFraction);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
