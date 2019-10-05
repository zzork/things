/* Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner 
 * as in the drawing:
 *
 * https://www.codewars.com/kata/559a28007caad2ac4e000083
 */


import java.math.BigInteger;

public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
		return fibSum(n).multiply(BigInteger.valueOf(4));
	}
    
  public static BigInteger fibSum(BigInteger n) {
    BigInteger a = BigInteger.valueOf(1);
    BigInteger b = BigInteger.valueOf(1);
    BigInteger c = BigInteger.valueOf(0);
    BigInteger total = BigInteger.valueOf(0);
    for (long i = 0; i <= n.longValue(); i++) {
      total = total.add(a);
      c = b.add(a);
      a = b;
      b = c;
    }
    return total;
  }
}
