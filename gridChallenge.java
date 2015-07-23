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
public class gridChallenge{
    
    static int getIndexOfObject(String word)
    {
        Vector val = new Vector();
        String[] alphabets = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(String charr:alphabets)
        {
            val.add(charr);
        }
        return val.indexOf(word);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        
        for (int i = 0; i < testCases; i++)
        {
            int length = input.nextInt();
            String[] array = new String[length];
            
            for(int j = 0; j < length; j++)
            {
                array[j] = input.next();
            }
            for (int a = 0; a < length; a++)
            {
                for (int j = 1; j < length; j++)
                {
                    String alphabet = array[a].substring(j,j+1);
                    for(int k = j - 1; k > 0; k--)
                    {
                        if (getIndexOfObject(array[a].substring(k,k + 1)) >   getIndexOfObject(array[a].substring(j,j + 1)))
                        {
                            String invariant = array[a].substring(k,k + 1);
                          //  array[a].substring(k,k + 1) = array[a].substring(j,j + 1);
                        }
                    }
                }
            }
        }
    }
    
}
