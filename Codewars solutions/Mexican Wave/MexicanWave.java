/* In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you 
 * must return that string in an array where an uppercase letter is a person standing up.
 */

public class MexicanWave {

    public static String[] wave(String str) {
    
        String[] results = new String[str.replaceAll("\\s", "").length()];
        
        int cIndex = 0;
        for (int i = 0; i < results.length; i++) {
            while (str.charAt(cIndex) == ' ') {
                cIndex++;
            }
            if (results.length == i - 1) {
                results[i] = str.substring(0, cIndex) + Character.toUpperCase(str.charAt(cIndex));
                cIndex++;
            }
            else {
                results[i] = str.substring(0, cIndex) + Character.toUpperCase(str.charAt(cIndex)) 
                        + str.substring(cIndex + 1);
                cIndex++;
                        
            }
        }
        System.out.println(results);
        return results;
    }    
}
