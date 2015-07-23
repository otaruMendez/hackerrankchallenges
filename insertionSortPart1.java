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
public class insertionSortPart1 {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] values = new int[size];
        int[] finalArray = new int[size];
        
        for (int i = 0; i < values.length; i++)
        {
            values[i] = input.nextInt();
        }
        
        for (int i = values.length-1; i > 0; i--)
        {
            if (values[i-1] > values[i])
            {
                int invariant = values[i];
                values[i] = values[i-1];
                for (int j = 0; j < values.length; j++)
                {
                    System.out.print(values[j]+" ");
                }
                System.out.println();
                values[i-1] = invariant;
            }
        }
        for (int j = 0; j < values.length; j++)
        {
              System.out.print(values[j]+" ");
        }
        System.out.println();
        
    }
}
