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
public class correctnessAndTheLoopInvariant {
    
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        int noOfElements = input.nextInt();
        int[] array = new int[noOfElements];
       
        
         for (int m = 0; m < array.length; m++)
         {
               array[m] = input.nextInt();
         }
         
         for (int i = 1; i < noOfElements; i++)
         {
             int presentIndex = i;
             for (int j = i-1 ; j >= 0; j--)
             {
                 if (array[presentIndex] < array[j])
                 {
                     int invariant = array[presentIndex];
                     array[presentIndex] = array[j];
                     array[j] = invariant;
                     presentIndex = j;
                 }
             }
             
            
         }
          for (int z = 0; z < noOfElements; z++)
             {
                 System.out.print(array[z] + " ");
             }
             System.out.println("");
        
    }
}

