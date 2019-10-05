/* Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example
 * if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the 
 * result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 */

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
    if (maxOccurrences == 0) return new int[] { };
    
    Map<Integer, Integer> counts = new HashMap();
    ArrayList<Integer> results = new ArrayList<Integer>();
    
    for (int i = 0; i < elements.length; i++) {
      
      if (counts.containsKey(elements[i])) {
        if (counts.get(elements[i]) < maxOccurrences) {
          results.add(elements[i]);
          counts.put(elements[i], counts.get(elements[i]) + 1);
        }
      }
      else if (!counts.containsKey(elements[i])) {
        results.add(elements[i]);
        counts.put(elements[i], 1);
      }
    }
    return results.stream().mapToInt(i -> i).toArray();
	}
}
