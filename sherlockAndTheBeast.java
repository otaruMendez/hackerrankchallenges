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
public class sherlockAndTheBeast {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfTestCases = input.nextInt();
        for (int i = 0; i < noOfTestCases; i++)
        {
            int value = input.nextInt();
            int remainder = 0;
            int quotient = 0;
            
            if (value >= 3)
            {
                quotient = value/3;
                remainder = value%3;
                if (remainder%5 == 0)
                {
                    for (int j = 0; j < quotient; j++)
                    {
                        System.out.print("5");
                    }
                    
                }
             }
         }
            
    }}

