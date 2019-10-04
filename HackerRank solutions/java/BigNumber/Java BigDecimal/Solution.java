/* Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the 
 * exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent 
 * numerically equivalent values (e.g., .1 = 0.1), then they must be listed in the same order as they were received as input).
 */

import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        
      	sc.close();
       
        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal d1 = new BigDecimal(s1);
                BigDecimal d2 = new BigDecimal(s2);
                return d1.compareTo(d2);
            }
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
