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
 */
public class counterGame {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfTesTCases = input.nextInt();
        int counter = 0;
        
        for (int i = 0; i < noOfTesTCases; i++)
        {
            BigInteger N = new BigInteger(input.next());
            BigInteger halfer =  N.divide(new BigInteger("2"));
            BigInteger two = halfer;
//            while(two.modPow(halfer, N).compareTo(N))
//            {
//                  halfer =  halfer.divide(new BigInteger("2"));
//                  BigInteger val = two.modPow(halfer, new BigInteger("1"));
//                  two.
//            }
            
            
            
        }
    }
    
}
