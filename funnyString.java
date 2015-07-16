/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankChallenges;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author I-LAB
 */
public class funnyString {
    
    public static String reverseWord(String word)
    {
        String reversedWord = "";
        for (int i = word.length(); i > 0; i--)
        {
            reversedWord += word.substring(i-1,i);
        }
        return reversedWord;
    }
    public static void main(String[] args)
    {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
         Vector vecChar = new Vector();
        for (int i = 0; i < alphabet.length; i++)
        {
            vecChar.add(alphabet[i]);
        }
        
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        for (int t= 0; t < testCases; t++)
        {
                String word = input.nextLine();
               String reversedWord = reverseWord(word);
                int counter = 0;
                for (int i = 1; i < reversedWord.length(); i++)
                {   
                      counter++;
                      String firstChar = word.substring(i, i+1);
                      String seconChar = word.substring(i-1, i);
                      int posFirst = vecChar.indexOf(firstChar);
                      int posSecond = vecChar.indexOf(seconChar);

                    //  System.out.println(firstChar + " " + seconChar);
                      int diff1 = posFirst-posSecond;
                      String rFirstChar = reversedWord.substring(i, i+1);
                      String rSeconChar = reversedWord.substring(i-1, i);
                      int rposFirst = vecChar.indexOf(rFirstChar);
                      int rposSecond = vecChar.indexOf(rSeconChar);

                     // System.out.println(rFirstChar + " " + rSeconChar + "---- " );
                      int diff2 = rposFirst-rposSecond;

                      if(Math.abs(diff1) != Math.abs(diff2))
                      {
                           break;
                      }

                }
                
                if (counter == reversedWord.length()-1)
                {
                    System.out.println("Funny" + "--- " + counter);
                }else
                {
                    System.out.println("Not Funny" +" --- " + counter);
                }
               }
    }
}
