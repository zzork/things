/* Given the triangle of consecutive odd numbers:
 *
 *              1
 *           3     5
 *        7     9    11
 *    13    15    17    19
 * 21    23    25    27    29
 * ...
 * Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 * 
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8
 */
 
class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;
        
        int t = (n * (n - 1)) / 2;
        int prev = t + t + 1;
        int total = 0;

        for (int i = 0; i < n; i++) {
          total += prev;
          System.out.println(total);
          prev += 2;          
        }
        return total;
    }
}
