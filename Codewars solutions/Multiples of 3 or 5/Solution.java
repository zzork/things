/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 *
 * For an O(1) solution to this problem see: 
 *
 * https://github.com/zzork/things/blob/master/HackerRank%20solutions/projectEuler%2B/MultiplesOf3and5.java
 */

public class Solution {

  public int solution(int number) {
    int total = 0;
    
    for (int i = 0; i < number; i++) {
        if (i % 3 == 0) total += i;
        else if (i % 5 == 0) total += i;
    }
    
    return total;
  }
}
