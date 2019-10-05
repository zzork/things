/* John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers 
 * representing the color of each sock, determine how many pairs of socks with matching colors there are.
 */

import java.io.*;
import java.util.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairs = 0;

        for (int sock : ar) {
            if (map.containsKey(sock)) {
                if (map.get(sock) % 2 == 1) {
                    pairs++;
                    map.put(sock, map.get(sock) + 1);
                }
                else 
                    map.put(sock, map.get(sock) + 1);
            }
            else
                map.put(sock, 1);
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
