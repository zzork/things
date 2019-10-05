/* You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in 
 * will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of 
 * sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the
 * type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : arr) {
            if (map.containsKey(n)) map.put(n, map.get(n) + 1);
            else map.put(n, 1);
        }

        int key = Integer.MIN_VALUE, value = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > value) {
                key = entry.getKey();
                value = entry.getValue();
            }
            else if (entry.getValue() == value) {
                if (entry.getKey() < key) {
                    key = entry.getKey();
                    value = entry.getValue();
                }
            }
        }
        return key;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
