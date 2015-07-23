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
public class similarPair {
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        int length = input.nextInt() - 1;
        int t = input.nextInt();
        int counter = 0;
        int[] left = new int[length];
        int[] right = new int[length];
        Vector checker = new Vector();
        
        for (int i = 0; i < length; i++)
        {
           left[i] = input.nextInt();
           right[i] = input.nextInt();
        }
        for (int i = 0; i < length; i++)
        {
           
           if(!checker.contains(left[i]))
           { 
            for (int j = 0; j < length; j++)
            {
                if (Math.abs(left[i] - right[j]) <= t)
                {
                    counter++;
                    System.out.println(left[i] + " ---- " + right[j]);
                }
            }
           
             checker.add(left[i]);
           }
        }
        
        System.out.println(counter);
    }
}
