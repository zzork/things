/* If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
 */
 
public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        java.util.HashMap<Character, Integer> map = new java.util.HashMap<Character, Integer>();
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (!map.containsKey(c) || map.get(c) < 1) {
                return false;
            } 
            else map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
