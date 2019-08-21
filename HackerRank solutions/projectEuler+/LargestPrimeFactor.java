/* The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of a given number N?
 */
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.println(calculate(in.nextLong()));
        }
    }

    static long calculate(long n) {
        //divide by 2 until we get an odd number
        while (n % 2 == 0) {
            n = n / 2;
            if (n == 1) return 2;
        }

        long largest = 0;
        //odd numbers will have only odd factors
        for (long i = 3; i <= (int)Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                n = n / i;
            }
            largest = i;
        }
        if (n > 2) return n;
        else return largest;
    }
}
