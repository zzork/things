/* You have an array of numbers.
 *
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 *
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 *
 * Example:
 *
 *    sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */

public class Kata {
  public static int[] sortArray(int[] array) {
    if (array.length < 1) return array;
    
    for (int i = 1; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        int lastOddIndex = i;
        for (int j = i - 1; j >= 0; j--) {
          if (array[j] % 2 != 0 && array[j] > array[lastOddIndex]) {
            int temp = array[j];
            array[j] = array[lastOddIndex];
            array[lastOddIndex] = temp;
            lastOddIndex = j;
          }
        }
      }
    }
    return array;
  }
}
