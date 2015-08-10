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
public class javaStringToken {
    
    public static void main(String[] args)
    {
       
        Scanner input = new Scanner(System.in);
        String val = input.nextLine();
      //  String finalVal = val.replaceAll("[^a-zA-Z0-9_-]", " ");
        String finalVal = val.replaceAll("[^\\P{Punct}]+"," ");
        String[] arrayVal = finalVal.split(" ");
        
        int counter  = 0;
        for(String vaq : arrayVal)
        {
            if(!vaq.isEmpty()){
            counter++;}
            
        }
        System.out.println(counter);
         for(String vaq : arrayVal)
        {
            if(!vaq.isEmpty()){
            System.out.println(vaq);}
            
        }
    }
}
