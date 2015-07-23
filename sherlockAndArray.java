/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class sherlockAndArray {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOftestCases = input.nextInt();
        String finalAnswer = "NO";
        for (int i= 0; i < noOftestCases; i++)
        {
            int length = input.nextInt();
            int[] array = new int[length];
            
            for (int j = 0; j < length; j++)
            {
                array[j] = input.nextInt();
            }
            
            if (length == 1)
            {
                finalAnswer = "YES";
            }
            else{
            for(int j = 1; j < length-1; j++)
            {
                int leftSideSum  = 0;
                int rightSideSum = 0;
                for (int k = j-1; k >= 0; k--)
                {
                    leftSideSum += array[k];
                }
                for(int k = j+1; k < length; k++)
                {
                    rightSideSum += array[k];
                }
                if (leftSideSum == rightSideSum)
                {
                    finalAnswer = "YES";
                    break;
                }
             }
            }
            System.out.println(finalAnswer);
            finalAnswer = "NO";
    }
}
}
