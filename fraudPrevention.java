/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;

/**
 *
 * @author engr
 * Uncompleted 02-07-2015 6:36pm
 */
public class fraudPrevention {
    
    public static void main(String[] args)
    {
        
         Scanner input = new Scanner(System.in);
         int totalDealAttempts = input.nextInt();
         String[] inputData = new String[totalDealAttempts+1];
         
         for(int i = 0; i < totalDealAttempts+1; i++)
         {
             inputData[i] = input.nextLine();
             System.out.println(inputData[i]);
          }
        
         for (int i = 1 ; i < totalDealAttempts; i++)
         {
           
            String[] deal1 =  inputData[i].split(",");
            String[] deal2 = inputData[i+1].split(",");
            
            if (!deal1[1].equals(deal2[1])){}
            else
            {
                if ((deal1[2].equals(deal2[2]) && !deal1[7].equals(deal2[7]))){}
                else{ System.out.println(deal1[0]+","+deal2[0]);} 
              
             }
            
         }
         
    }
}
