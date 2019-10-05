/* You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total 
 * age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she 
 * successfully blow out.
 */

import java.util.*;
import java.io.*;

public class Solution {

    static int birthdayCakeCandles(int[] ar) {
        int tallest = Integer.MIN_VALUE, count = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > tallest) {
                tallest = ar[i];
                count = 1;
            }
            else if (ar[i] == tallest) count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
