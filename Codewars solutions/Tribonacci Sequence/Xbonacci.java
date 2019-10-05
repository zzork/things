/* This problem focuses on calculating "tribonnaci" sequences.
 *
 * The tribonnaci sequence is similar to the fibonacci sequence, but each term is the sum of the preceding three. This means that the
 * series progresses differently depending on how it is seeded. 
 *
 * For more information and the problem statement see here: https://www.codewars.com/kata/556deca17c58da83c00002db
 */

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      if (n == 0) return new double[0];
      double[] seq = new double[n];
      seq[0] = s[0];
      if (n == 1) return seq;
      seq[1] = s[1];
      if (n == 2) return seq;
      seq[2] = s[2];
      if (n == 3) return seq;
      
      for (int i = 3; i < n; i++) {
          seq[i] = seq[i-1] + seq[i-2] + seq[i-3];
      }
      return seq;
  }
}
