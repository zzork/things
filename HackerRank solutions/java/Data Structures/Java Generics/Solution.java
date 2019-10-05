/* Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements 
 * of both arrays. The method should be able to accept both integer arrays or string arrays.
 */

import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
    public Printer() {}

    public <T> void printArray(T[] array) {
        int length = array.length;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
