/* Write a function that takes an integer n and returns the value of n!.
 */

import java.math.BigInteger;

public class Kata
{

  public static String Factorial(int n) {
    if (n <= 1) return "1";
  
    BigInteger result = new BigInteger(Integer.toString(n));
    int count = n - 1;
    
    for (int i = n - 1; i > 0; i--) {
      result = result.multiply(new BigInteger(Integer.toString(i)));
    }
    return result.toString();
  }
}
