/* Order a list of numbers in ascending order, according to the sum of their digits. When two numbers have the same digit sums order them
 * lexicographically.
 */

import java.util.Comparator;
import java.util.Arrays;

public class WeightSort {
	
	public static String orderWeight(String strng) {
		String[] weights = strng.split(" ");
    Arrays.sort(weights, new Comparator<String>() {
      public int compare(String a, String b) {
        int aWeight = a.chars().map(c -> Character.getNumericValue(c)).sum();
        int bWeight = b.chars().map(c -> Character.getNumericValue(c)).sum();
        return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
      }
    });
    return String.join(" ", weights);
	}
}
