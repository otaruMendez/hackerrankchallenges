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
public class twoStrings {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        Vector vs1 = new Vector();
        Vector vs2 = new Vector();
        
        for(int i = 0; i < word1.length(); i++)
        {
            vs1.add(word1.substring(i,i+1));
        }
        
    }
}
