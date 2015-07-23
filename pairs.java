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
public class pairs {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int diffValue = input.nextInt();
        int[] arr = new int[length];
        
        for (int  i =0; i < length; i++)
        {
            arr[i] = input.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < length  ; i++)
        {
            for (int j = i+1; j < length; j++)
            {
                if (arr[i] - arr[j] == diffValue)
                {
                    counter++;
                }
            }
            for (int j = 0; j < i; j++)
            {
                if (arr[i] - arr[j] == diffValue)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
