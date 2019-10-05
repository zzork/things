/* Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 */

import java.io.*;
import java.util.*;

public class Solution {
    static String timeConversion(String s) {
        String[] components = s.split(":");
        if (components[2].substring(2).equals("PM")) {            
            if (!components[0].equals("12")) {
                components[0] = String.valueOf(Integer.parseInt(components[0]) + 12);
            }
        }
        else if (components[0].equals("12")) components[0] = "00";

        components[2] = components[2].substring(0, 2);
        return String.format("%s:%s:%s", components[0], components[1], components[2]);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
