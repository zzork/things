/* Monica wants to buy a keyboard and a USB drive from her favorite electronics store. The store has several models of each. Monica 
 * wants to spend as much as possible for the  items, given her budget.
 *
 * Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the amount of money Monica will 
 * spend. If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead. She will buy only the two required 
 * items.
 */

import java.io.*;
import java.util.*;

public class Solution {

    //O(n*m) solution
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;

        for (int keyboard : keyboards) {
            if (keyboard > b) continue;
            for (int drive : drives) {
                if (keyboard + drive <= b)
                    max = Math.max(max, keyboard + drive);
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
