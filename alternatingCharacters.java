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
public class alternatingCharacters {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfWords = input.nextInt();
        
       
        for(int a = 0; a < noOfWords; a++)
        {
             int counter = 0;
            String word = input.next();
            for(int i = 0; i < word.length()-1; i++)
            {
               
                if(word.substring(i,i+1).equals(word.substring(i+1,i+2)))
                {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
