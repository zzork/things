/* You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the 
 * number located in yth position of xth line.
 * 
 * For more detail see: https://www.hackerrank.com/challenges/java-arraylist/problem
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer>[] list = new ArrayList[n];

        //populate list
        for (int i = 0; i < n; i++) {
            int o = input.nextInt();
            list[i] = new ArrayList<Integer>();
            for (int j = 0; j < o; j++) {
                list[i].add(input.nextInt());
            }
        }

        int q = input.nextInt();

        for (int i = 0; i < q; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;

            try {
                System.out.println(list[x].get(y));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}

