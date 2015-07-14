/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author engr
 * date - 04-07-2015 1:32am
 */
public class extraLongFactorials {
    
    long output = 0;
    
    
    
    public static BigInteger getLongFactorial(int n)
    {
     String nString = Integer.toString(n);
     BigInteger  inp =  new BigInteger(nString);
     
       if (n == 1)
       {
          BigInteger one = new BigInteger("1");
           return one;
       }
       else
       {
           return inp.multiply(getLongFactorial(n-1));
       }
   }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        System.out.println(getLongFactorial(value));
    }
}
