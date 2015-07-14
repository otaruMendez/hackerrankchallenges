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
public class sherlockAndSquares {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        
        for (int i = 0; i < testCases; i++)
        {
            int counter = 0;
            int a = input.nextInt();
            int b = input.nextInt();
            
            for(int j = a; j <= b; j++)
            {
                double value = Math.sqrt(j);
                if (Double.toString(value).length() == 3)
                {
                    if (Double.toString(value).substring(2,3).equals("0"))
                    {
                        counter++;
                    }
                }
                
            }
            System.out.println(counter);
        }
    }
}
