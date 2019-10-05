/* Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" 
 * elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the
 * order.
 */

import java.util.Arrays;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
    if (a == null || b == null || a.length != b.length) return false;
    // Sort arrays
    a = Arrays.stream(a).map(i -> i * i).sorted().toArray();
    b = Arrays.stream(b).sorted().toArray();
    // Check if sorted arrays are equal
    return Arrays.equals(a, b);
  }
}
