/* Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.
 *
 * The Morse code table is preloaded for you as a dictionary, feel free to use it.
 */
 
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] words = morseCode.trim().split("   ");
        
        for (int i = 0; i < words.length; i++) {
            String[] word = words[i].split(" ");
            for (String letter : word) {
                result.append(MorseCode.get(letter));
            }
            if (i < words.length - 1) result.append(" ");
        }
        return result.toString();
    }
}
