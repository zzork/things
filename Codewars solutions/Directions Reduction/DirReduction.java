/* Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed 
 * (W<->E or S<->N side by side).
 *
 * For more detail see: https://www.codewars.com/kata/550f22f4d758534c1100025a
 */

import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> results = new ArrayList<String>(Arrays.asList(arr));
        
        for (int i = 1; i < results.size(); i++) {
            System.out.println(results);
            System.out.println("i: " + i);
            if (results.size() > 1 && areOpposites(results.get(i - 1), results.get(i))) {
                results.remove(i - 1);
                results.remove(i - 1);
                i = 0;  
            }
        }
        
        return results.toArray(new String[0]);
    }
    
    public static boolean areOpposites(String s1, String s2) {
        return (s1.equals("NORTH") && s2.equals("SOUTH") ||
                s1.equals("SOUTH") && s2.equals("NORTH") ||
                s1.equals("EAST") && s2.equals("WEST")   ||
                s1.equals("WEST") && s2.equals("EAST"));
    }
}
