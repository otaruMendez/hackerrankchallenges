/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class javaStrings {
    
   
    
    
    public static void main(String[] args)
    {
        List<String> alpha = new ArrayList<>();
         String[] alphabets = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
         alpha.addAll(Arrays.asList(alphabets));
        
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int val = input.nextInt();
        
        List<String> values = new Vector();
       // List<String> values2 = new Vector();
        
        for(int i = 0; i < word.length()+1-val; i++)
        {
            values.add(word.substring(i,i+val));
        }
        
        for (int i = 1; i < values.size(); i++)
        {
           for (int j = i; j >= 0; j--)
           {
               if(values.get(j).compareTo(values.get(i)) < 0)
               {
                   String invariant1 = values.get(i);
                   String invariant2 = values.get(j);
                   values.remove(j);
                   values.add(j, invariant1);
                   values.remove(i);
                   values.add(i,invariant2);
               }
           }
        }
        
//      for (String arr : values)
//        {
//            System.out.println(arr);
//        }
        
        System.out.println(values.get(values.size()-1));   
        System.out.println(values.get(0));
        
    }
}
