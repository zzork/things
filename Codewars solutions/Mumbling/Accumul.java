/* The examples below show you how to write function accum:
 *
 * Examples:
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 /*

public class Accumul {
    
    public static String accum(String s) {
        String[] result = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = clone(s.charAt(i), i);
        }
        return String.join("-", result);
    }
    
    public static String clone(char c, int n) {
        if (n == 0) return Character.toUpperCase(c) + "";
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(c));
        char ch = Character.toLowerCase(c);
        for (int i = 0; i < n; i++) {
            result.append(ch);
        }
        return result.toString();
    }
}
