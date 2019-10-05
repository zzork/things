/* Complete the dayOfProgrammer function in the editor below. It should return a string representing the date of the 256th day of the year 
 * given.
 *
 * This problem involves switching between the Gregorian and Julian calendar systems as appropriate; see the link below for further
 * detail:
 *
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
 
import java.io.*;
import java.util.*;

public class Solution {

    static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09.1918";

        else if (year < 1918) {
            if (year % 4 == 0)
                return String.format("12.09.%d", year);
            else
                return String.format("13.09.%d", year);
        }
        
        else {
            if (year % 100 == 0 && year % 400 == 0) 
               return String.format("12.09.%d", year);
            if (year % 4 == 0 && year % 100 != 0)
                return String.format("12.09.%d", year);
            else
                return String.format("13.09.%d", year);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
