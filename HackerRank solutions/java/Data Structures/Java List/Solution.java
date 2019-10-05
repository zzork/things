/* For this problem, we have  types of queries you can perform on a List:
 *
 * 1. Insert y at index x:
 *
 *   Insert
 *   x y
 *
 * 2. Delete the element at index x:
 *
 *   Delete
 *   x
 *
 * Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single 
 * line of space-separated integers.
 *
 * For more detail see: https://www.hackerrank.com/challenges/java-list/problem
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        n = scan.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s = scan.next();

            if (s.equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            }
            else { //"delete"
                list.remove(scan.nextInt());
            }
        }
        list.forEach(i -> System.out.print(i + " "));
    }
}

