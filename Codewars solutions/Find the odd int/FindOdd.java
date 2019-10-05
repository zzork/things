/* Given an array, find the int that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */
 
import java.util.HashMap;

public class FindOdd {
	public static int findIt(int[] a) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < a.length; i++) {
        if (map.containsKey(a[i])) {
            map.put(a[i], map.get(a[i]) + 1);
        }
        else map.put(a[i], 1);
    }
    int result = 0;
    
    for (Integer key : map.keySet()) {
        if (map.get(key) % 2 == 1) result = key;
    }
  	return result;
  }
}
