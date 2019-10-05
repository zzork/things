/* You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either 
 * entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the
 * array as an argument and returns this "outlier" N.
 */

import java.util.Arrays;

public class FindOutlier {
  static int find(int[] integers) {
    int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i % 2)).sum();
    int mod = (sum < 2) ? 1 : 0;
    
    for (int i = 0; i < integers.length; i++) {
        if (Math.abs(integers[i] % 2) == mod) return integers[i];
    }
    return 0;
  }
}
