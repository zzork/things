/* Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * 
 * By starting with 1 and 2, the first 10 terms will be:
 *     
 *    1, 2, 3, 5, 8, 13, 21, 34, 55, 89
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed N, find the sum of the even-valued terms.
 */
 
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.println(calculate(in.nextLong()));
        }
    }
    
    //Both solutions O(n), but this one only iterates over every even (third) term in the sequence
    static long calculate(long n) {
        long sum = 0, current = 2, prev1 = 2, prev2 = 0;

        while (current < n) {
            sum += current;
            //evenFib(n) = 4 * evenFib(n-1) + evenFib(n-2)
            current = 4 * prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return sum;
    }
    
    //Iterates over every term
    static long calculateIteratively(long n) {
        //iterates through fib(1) to fib(n)
        long sum = 0, current = 0, prev1 = 1, prev2 = 0;
        
        while (current < n) {
            if (current % 2 == 0) sum += current;
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return sum;
    }
}

