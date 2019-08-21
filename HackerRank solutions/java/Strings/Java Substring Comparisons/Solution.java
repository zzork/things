/* Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of 
 * length k.
 */

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        
        for (int i = 0; i < s.length() - (k - 1); i++) {
            String sub = s.substring(i, i + k);
            if (smallest.compareTo(sub) > 0) smallest = sub;
            if (largest.compareTo(sub) < 0) largest = sub;
        }
        return smallest + "\n" + largest;
    }
}
