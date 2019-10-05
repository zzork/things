/* You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to 
 * the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.
 */

import java.util.Arrays;

public class Kata {
  public static int findEvenIndex(int[] arr) {
    int left = 0, right = Arrays.stream(arr).sum() - arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      left += arr[i];
      right -= arr[i - 1];
      if (left == right) return i;
    }
    return -1;
  }
}
