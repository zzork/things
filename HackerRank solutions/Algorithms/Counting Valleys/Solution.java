/* Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike 
 * he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step. Gary's hikes start and end at 
 * sea level and each step up or down represents a 1 unit change in altitude. We define the following terms:
 *
 *    1. A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step 
 *    down to sea level.
 *    2. A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up
 *    to sea level.
 *
 * Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
 */
 
import java.io.*;
import java.util.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int currentHeight = 0, numValleys = 0;

        for (char c : s.toCharArray()) {
            currentHeight = (c == 'U') ? ++currentHeight : --currentHeight;
            //if we're coming out of a valley add one to the counter
            if (c == 'U' && currentHeight == 0) numValleys++;
        }
        return numValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
