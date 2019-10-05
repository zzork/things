/* You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in 
 * the positive direction (i.e, toward positive infinity).
 *
 * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
 *
 * You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return 
 * YES, otherwise return NO.
 */
 
import java.io.*;
import java.util.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2 >= v1) return "NO";
        while (true) {
            x1 += v1;
            x2 += v2;
            if (x1 == x2) return "YES";
            else if (x1 > x2) return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
