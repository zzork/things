/* The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character 
 * appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization
 * when determining if a character is a duplicate.
 *
 * Examples:
 *
 *    "din"      =>  "((("
 *    "recede"   =>  "()()()"
 *    "Success"  =>  ")())())"
 *    "(( @"     =>  "))((" 
 */

import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    HashMap<Character, Integer> chars = new HashMap<>();
    
    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (chars.containsKey(ch)) 
            chars.put(ch, 2);
        else chars.put(ch, 1);
    }
    StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < word.length(); i++) {
        if (chars.get(word.charAt(i)) > 1) result.append(")");
        else result.append("(");
    }
    
    return result.toString();
  }
}
