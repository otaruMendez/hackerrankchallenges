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
public class anagram {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        for (int i = 0; i < testCases; i++)
        {
            String word = input.next();
            if(word.length()%2 != 0)
            {
                System.out.println(-1);
            }
            else
            {
                String s1 = word.substring(0,word.length()/2);
               
                String s2 = word.substring(word.length()/2,word.length());
                Vector vs1 = new Vector();
                Vector vs2 = new Vector();
                Vector copys1 = vs1;
                 for (int j=0; j < s1.length(); j++)
                 {
                     vs1.add(s1.substring(j,j+1));
                     vs2.add(s2.substring(j,j+1));
                 }
                
                  for (int j=0; j < vs1.size(); j++)
                 {
                     
                     if(vs2.contains(vs1.elementAt(j)))
                     {
                         int vs2Index = vs2.indexOf(vs1.elementAt(j));
                         vs2.remove(vs2Index);
                     }
                }
                  System.out.println(vs2.size());
            }
         }
     }
}