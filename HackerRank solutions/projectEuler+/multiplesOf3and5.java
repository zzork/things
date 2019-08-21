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
            System.out.println(calculate(in.nextInt()));
        }
    }
    
    //O(1) solution
    static long calculate(int n) {
        //no of occurences of k % 3 = 0 where k < n
        long a = (n - 1) / 3;
        //3 * sum of numbers from 1 to a 
        a = 3 * a * (a + 1) / 2;

        long b = (n - 1) / 5;
        b = 5 * b * (b + 1) / 2;

        //LCM(3, 5) multiples will be counted twice, so subtract these
        long c = (n - 1) / 15;
        c = 15 * c * (c + 1) / 2;

        return a + b - c;
    }
    
    //O(n)
    static int calculateIteratively(int n) {
        int total = 0;
        for (int i = 3; i < n; i += 3) {
            total += i;
        }
        for (int i = 5; i < n; i += 5) {
            total += i;
        }
        for (int i = 15; i < n; i += 15) {
            total -= i;
        }
        return total;
    }
}

