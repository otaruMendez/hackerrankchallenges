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
public class runningTimeOfAlgorithms {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfItems =  input.nextInt();
        int[] values = new int[noOfItems];
        int counter = 0;
        
        for (int i = 0; i < noOfItems; i++)
        {
            values[i] = input.nextInt();
        }
        
        for (int i = 0; i < values.length-1; i++)
        {
          
            for (int j = i+1; j < values.length; j++)
            {
                if (values[i] > values[j])
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
