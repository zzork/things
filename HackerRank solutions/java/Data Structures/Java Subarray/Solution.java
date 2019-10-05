/* Given an array of n, integers, find and print its number of negative subarrays on a new line.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            int current = 0;
            for (int j = i; j >= 0; j--) {
                current += arr[j];
                if (current < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

