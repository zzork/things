/* You are given an array of n integers, ar = [ar[0], ar[1], ..., ar[n-1]], and a positive integer, k. Find and print the number 
 * of (i, j) pairs where i < j and ar[i] + ar[j] is divisible by k.
 */

import java.io.*;
import java.util.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    set.add(String.format("%d %d", i, j));
                }
            }
        }
        return set.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}