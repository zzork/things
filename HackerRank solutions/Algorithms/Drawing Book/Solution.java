/* Given n and p, find and print the minimum number of pages Brie must turn in order to arrive at page p.
 *
 * For more detail see: https://www.hackerrank.com/challenges/drawing-book/problam
 */

import java.io.*;
import java.util.*;

public class Solution {

    static int pageCount(int n, int p) {
        if (p == 0 || p == n) return 0;

        int fromFront = 0, fromBack = 0;

        fromFront = p / 2;
        fromBack = (n % 2 == 0) ? (n - p + 1) / 2 : (n - p) / 2;

        return Math.min(fromFront, fromBack);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
