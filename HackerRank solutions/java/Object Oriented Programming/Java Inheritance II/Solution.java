/* Write the following code in your editor below:
 *
 * A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
 * A class named Adder that inherits from a superclass named Arithmetic.
 * Your classes should not be be public.
 */

class Arithmetic {
    public Arithmetic() {}

    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    public Adder() {}
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
