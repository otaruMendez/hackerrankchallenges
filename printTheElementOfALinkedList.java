/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author engr
 */
public class printTheElementOfALinkedList {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       // BufferedReader br = new BufferedReader(br);
        
        
        while(!"".equals(input.nextLine()))
         
        {
        String val = input.next(); 
        String[] arrayVal = val.split("->");
        
        LinkedList<Integer> valsd = new LinkedList();
//        valsd.add(Integer.parseInt(arrayVal[i]));
        
        int vals[] =new int[arrayVal.length];
        int counter = 0;
        for(int i = 0; i < arrayVal.length; i++)
        {
            if(!"NULL".equals(arrayVal[i]))
            {
                vals[counter] = Integer.parseInt(arrayVal[i]);
                counter++;
            }
            
        }
        
        for (int i = 0; i < counter; i++)
        {
            System.out.println(vals[i]+" ");
        }

        }
    }
}
