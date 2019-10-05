/* You are given a class Solution and its main method in the editor.
 *
 * Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function 
 * add.
 */
 
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
    public Add() {}

    public void add(int... nums) {
        int inputs = nums.length;
        int sum = 0;
        for (int i = 0; i < inputs; i++) {
            if (i == inputs - 1) {
                System.out.print(nums[i] + "=");
                sum += nums[i];
            }
            else {
                System.out.print(nums[i] + "+");
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}


public class Solution {

    public static void main(String[] args) {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	

}

