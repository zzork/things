/* Given a string A, print Yes if it is a palindrome, print No otherwise.
 */
 
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean isPalindrome = true;
        
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) System.out.println("Yes");
        else System.out.println("No");       
    }
}



