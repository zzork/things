/* Consider a staircase of size n:
 *
 *        #
 *       ##
 *      ###
 *     ####
 *
 * Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not
 * preceded by any spaces.
 *
 * Write a program that prints a staircase of size n.
 */
 
import java.util.*;

public class Solution {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
