/* Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and 
 * the second being Bob's.
 *
 * For more detail see: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoints = ((a.get(0) > b.get(0)) ? 1 : 0) + 
                      ((a.get(1) > b.get(1)) ? 1 : 0) +
                      ((a.get(2) > b.get(2)) ? 1 : 0);
        int bPoints = ((b.get(0) > a.get(0)) ? 1 : 0) + 
                      ((b.get(1) > a.get(1)) ? 1 : 0) +
                      ((b.get(2) > a.get(2)) ? 1 : 0);

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(aPoints);
        arr.add(bPoints);
        return arr;
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
