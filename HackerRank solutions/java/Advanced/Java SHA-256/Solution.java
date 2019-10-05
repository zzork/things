/* Given a string, d, print its SHA-256 hash value.
 */
 
import java.util.Scanner;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(s.getBytes());
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

