/* Java's BitSet class implements a vector of bit values (i.e.: false (0) or true (1)) that grows as needed, allowing us to easily 
 * manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is called a set bit.
 *
 * Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. After each 
 * operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
 *
 * For more detail see: https://www.hackerrank.com/challenges/java-bitset/problem
 */
 
import java.util.*;
import java.util.function.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        BitSet[] bitSets = new BitSet[] {new BitSet(n), new BitSet(n)};
        HashMap<String, BiConsumer<Integer, Integer>> cmd = new HashMap<String, BiConsumer<Integer, Integer>>();
            
        // Use lambas in place of functional interface
        cmd.put("AND", (a, b) -> bitSets[a-1].and(bitSets[b-1]));
        cmd.put("OR", (a, b) -> bitSets[a-1].or(bitSets[b-1]));
        cmd.put("XOR", (a, b) -> bitSets[a-1].xor(bitSets[b-1]));
        cmd.put("FLIP", (a, b) -> bitSets[a-1].flip(b));
        cmd.put("SET", (a, b) -> bitSets[a-1].set(b));

        while (m-- > 0) {
            cmd.get(in.next()).accept(in.nextInt(), in.nextInt());
            System.out.println(bitSets[0].cardinality()+ " " +bitSets[1].cardinality());
        }
    }
}

