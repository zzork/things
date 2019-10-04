/* A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime 
 * numbers are 2, 3, 5, 7, 11, and 13.
 *
 * Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 */
 
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        if (new BigInteger(n).isProbablePrime(1)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
