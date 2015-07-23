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
public class andProduct {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfTestCases = input.nextInt();
        for (int i = 0; i < noOfTestCases; i++)
        {
            
            BigInteger firstNo = new BigInteger(input.next());
            BigInteger secondNo = new BigInteger(input.next());
            
            BigInteger ifirstNo = firstNo;
            BigInteger isecondNo = secondNo;
           
            
           while(ifirstNo.compareTo(isecondNo) != 0)
           {
               ifirstNo.add(new BigInteger("1"));
              firstNo =  firstNo.and(firstNo.add(new BigInteger("1")));
             
           }
            System.out.println(firstNo);
//            int firstNo = input.nextInt();
//            int secondNo = input.nextInt();
//           
//            for (int j = firstNo; j <= secondNo; j++)
//            {
//                firstNo &= firstNo++;
//            }
//            System.out.println(firstNo);
        }
    }
}
