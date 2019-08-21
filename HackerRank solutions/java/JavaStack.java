/* A string containing only parentheses is balanced if the following is true: 
 *  	1. if it is an empty string 
 *	2. if A and B are correct, AB is correct, 
 *	3. if A is correct, (A) and {A} and [A] are also correct.
 *
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
 *
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 *
 * Given a string, determine if it is balanced or not.
 */

import java.util.*;
import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < input.length(); i++) {
                if (!stack.isEmpty()) {
                    switch (input.charAt(i)) {
                        case ')' : if (stack.peek() == '(') {
                            stack.pop();
                            break;
                        }
                        case '}' : if (stack.peek() == '{') {
                            stack.pop();
                            break;
                        }
                        case ']' : if (stack.peek() == '[') {
                            stack.pop();
                            break;
                        }
                        default : 
                            stack.push(input.charAt(i));
                    }
                }
                else
                    stack.push(input.charAt(i));
            }
            System.out.println(stack.isEmpty());
		}		
	}
}


