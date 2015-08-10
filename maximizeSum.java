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
public class maximizeSum {
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfTestCases = input.nextInt();
        int noOfTerms = input.nextInt();
        int modulus = input.nextInt();
        int[] array = new int[noOfTerms];
        
        for (int i = 0; i < noOfTerms; i++)
        {
            array[i] = input.nextInt();
        }
        
        int counter = 0;
        int keeper = 0;
        int finalKeeper = 0;
        boolean initialValSet = true;
        
        for (int i = 0; i < noOfTestCases; i++)
        {
            for (int a = 0; a < noOfTerms; a++)
            {
                
                for (int j = a+1; j < noOfTerms; j++)
                {
                  counter += array[j-1];

                  if (counter > modulus-1)
                  {
                      counter -= array[j];
                      keeper = counter;
                     // System.out.println(keeper);
                      if(initialValSet)
                      {
                          finalKeeper = keeper;
                          initialValSet = false;
                      }
                      break;
                  }


                }
                if(keeper > finalKeeper)
                {
                    finalKeeper = keeper;
                }
        
         }
            System.out.println(finalKeeper);
        }
        
    }
}
