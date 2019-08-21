/* The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = 1;
        while(scan.hasNext()) {
            System.out.println(line + " " + scan.nextLine());
            line++;
        }
    }
}
