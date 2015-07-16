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
public class pangrams {
    
    public static void main(String[] args)
    {
        String[] alphabets = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.replaceAll(" ", "");
        word = word.toLowerCase();
        Vector letters = new Vector();
        Vector lettersChecked = new Vector();
        int counter  = 0;
        
        for (int i = 0; i < alphabets.length; i++)
        {
            letters.add(alphabets[i]);
        }
        
        for (int i = 0; i < word.length(); i++)
        {
            if (letters.contains(word.substring(i, i+1)) && !lettersChecked.contains(word.substring(i,i+1)))
            {
                counter++;
                lettersChecked.add(word.substring(i,i+1));
            }
        }
        
        if(counter == 26)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }
        
        
    }
}
