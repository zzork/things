/* Simple transposition is a basic and simple cryptography technique. We make 2 rows and put first a letter in the Row 1, the second in 
 * the Row 2, third in Row 1 and so on until the end. Then we put the text from Row 2 next to the Row 1 text and thats it.
 *
 * Complete the function that recieves a string and encrypt it with this simple transposition.
 */
 
public class Kata {
    public static String simpleTransposition(String text) {
        StringBuilder evens = new StringBuilder();
        StringBuilder odds = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                evens.append(text.charAt(i));
            }
            else {
                odds.append(text.charAt(i));
            }
        }
        return evens.toString() + odds.toString(); 
    }
}
