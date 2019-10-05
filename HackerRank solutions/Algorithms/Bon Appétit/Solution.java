/* Anna and Brian are sharing a meal at a restuarant and they agree to split the bill equally. Brian wants to order something that Anna 
 * is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and calculates Anna's portion. You must 
 * determine if his calculation is correct.
 *
 * For more detail see: https://www.hackerrank.com/challenges/bon-appetit/problem
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        //uses intValue to make auto-unboxing explicit
        int sum = bill.stream().mapToInt(Integer::intValue).sum();
        int adjustedSum = sum - bill.get(k);

        if (b  == adjustedSum / 2) 
            System.out.println("Bon Appetit");
        else 
            System.out.println(sum / 2 - adjustedSum / 2);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
