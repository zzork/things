/* Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to
 * share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers
 * on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.
 */

import java.io.*;
import java.util.*;

public class Solution {

    static int birthday(List<Integer> s, int d, int m) {
        //return no of segments of length m totalling d
        int max = s.size() - (m - 1), count = 0;

        for (int i = 0; i < max; i++) {
            int total = 0;
            for (int j = i; j < i + m; j++) {
                total += s.get(j);
            }
            if (total == d) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
