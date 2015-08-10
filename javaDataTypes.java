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
public class javaDataTypes{
    
    static boolean InRange(BigInteger min,BigInteger val, BigInteger max)
    {
        if (min.compareTo(val)!=1 && max.compareTo(val) != -1)
        {
            return true;
        }else
        {
            return false;
        }
        
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
      //  int noOfTestCases = input.nextInt();
        
        BigInteger byteval1 = new BigInteger("127");
          BigInteger byteval2 = new BigInteger("-128");
            BigInteger shortval3 = new BigInteger("32767");
              BigInteger shortval4 = new BigInteger("-32768");
                BigInteger inttval5 = new BigInteger("2147483647");
                  BigInteger inttval6 = new BigInteger("-2147483648");
                    BigInteger longval7 = new BigInteger("9223372036854775807");
                      BigInteger longval8 = new BigInteger("-9223372036854775808");
        
       BigInteger val = new BigInteger(input.next());
       
        System.out.println(val + "can be contained in:");
       if (InRange(byteval2, val, byteval1))
       {
           System.out.println("* byte");
           System.out.println("* short");
           System.out.println("* int");
           System.out.println("* long");
       }
       else
       {
           if(InRange(inttval6, val, inttval5))
           {
                 System.out.println("* short");
                 System.out.println("* int");
                 System.out.println("* long");
           }
           else
           {
                if(InRange(shortval4, val, shortval3))
                 {
                     System.out.println("* int");
                     System.out.println("* long");
                  }
                else
                {
                     if(InRange(longval8, val, longval7))
                     {
                        System.out.println("* long");
                     }
                }
           }
           
       }
    }
}
    
       
