/* In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data 
 * types like a long integer.
 */
 
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.nextLine());
        BigInteger b = new BigInteger(input.nextLine());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}

