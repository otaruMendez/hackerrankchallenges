/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;

/**
 *
 * @author engr
 */
public class iceCreamParlor {
    
    public static void main(String[] args)
    {
          Scanner input = new Scanner(System.in);
        int noOftestCases = input.nextInt();
        for (int i= 0; i < noOftestCases; i++)
        {
            int noToLookFor = input.nextInt();
            int length = input.nextInt();
            int[] array = new int[length];
            boolean breaker = false;
            
            for (int j = 0; j < length; j++)
            {
                array[j] = input.nextInt();
            }
            
            if (length == 1)
            {
               if (array[0] == noToLookFor)
               {
                   System.out.println(1);
               }
            }
            else{
            for(int j = 1; j < length-1; j++)
            {
               
                for (int k = j-1; k >= 0; k--)
                {
                  
                    if ((array[j] + array[k]) == noToLookFor)
                    {
                        System.out.println(k+1 + " " + (j+1));
                        breaker = true;
                        break;
                    }
                }
                
                if (breaker)
                {
                    break;
                }
                for(int k = j+1; k < length; k++)
                {
                  
                     if ((array[j] + array[k]) == noToLookFor)
                    {
                        System.out.println(j+1 + " " + (k+1));
                         breaker = true;
                         break;
                    }
                }
                 if (breaker)
                {
                    break;
                }
             }
            }
    }
    }
}
