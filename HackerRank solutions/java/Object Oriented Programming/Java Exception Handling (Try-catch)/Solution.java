/* You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception
 * will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
 *
 * See: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a / b);
        }
        catch (InputMismatchException e1) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e2) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

