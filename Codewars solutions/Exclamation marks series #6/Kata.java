/* Remove n exclamation marks in the sentence from left to right. n is positive integer.
 */

public class Kata {

  public static String remove(String s, int n){
    if (n == 0) return s;
    
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '!' && n > 0) {
        n--;
      }
      else result.append(s.charAt(i));
    }
    return result.toString();
    
  }
  
}
