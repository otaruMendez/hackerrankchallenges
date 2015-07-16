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
public class makeItAnagram {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        Vector splitter1 = new Vector();
        Vector splitter2 = new Vector();
        
        for(int i = 0; i < word1.length(); i++)
        {
            splitter1.add(word1.substring(i, i+1));
        }
        for(int i = 0; i < word2.length(); i++)
        {
            splitter2.add(word2.substring(i, i+1));
        }
        
        
        for(int i = 0; i < word1.length(); i++)
        {
           if(splitter1.contains(word1.substring(i,i+1)) && splitter2.contains(word1.substring(i, i+1)))
           {
               splitter1.remove(word1.substring(i, i+1));
               splitter2.remove(word1.substring(i, i+1));
           }
        }
        System.out.println(splitter1.size() + splitter2.size());
    }
}
