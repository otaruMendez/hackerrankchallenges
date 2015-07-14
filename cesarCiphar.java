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
 * date - 03-07-2015 12:56am
 */
public class cesarCiphar {
    
   
    public static void main(String[] args)
    {
        String[] alphabets = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] upperCaseAlphabets = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Vector vecAlphabets = new Vector();
        Vector upperCaseVecAlphabets = new Vector();
        String encryptedString = "";
        for (int i = 0; i < alphabets.length; i++)
        {
            vecAlphabets.addElement(alphabets[i]);
            upperCaseVecAlphabets.addElement(upperCaseAlphabets[i]);
        }
        Scanner input = new Scanner(System.in);
        
        int stringLength = input.nextInt();
        String word = input.next(); 
        int encryptionCode = input.nextInt();
        
        for (int i = 0; i < word.length(); i++)
        {
            String letter = word.substring(i, i+1);
            
            if (vecAlphabets.contains(letter))
            {
                int indexValue = vecAlphabets.indexOf(letter);
                int encryptedIndexVal = indexValue + encryptionCode;
                encryptedString += vecAlphabets.elementAt(encryptedIndexVal%26);
             }
            else
            {
                if (upperCaseVecAlphabets.contains(letter))
                {
                    int indexValue = upperCaseVecAlphabets.indexOf(letter);
                    int encryptedIndexVal = indexValue + encryptionCode;
                    encryptedString += upperCaseVecAlphabets.elementAt(encryptedIndexVal%26);
                 }
                else
                {
                    encryptedString += letter;
                }
            }
        }
        System.out.println(encryptedString);
      }
}
