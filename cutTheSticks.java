/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;

/**
 *
 * @author engr
 * date - 02-07-2015 11:30pm
 */
public class cutTheSticks {
    
    public static int getSmallestStick(int[] sticks)
    {
        int smallestStick = sticks[0];
        int arrLength = sticks.length;
        for(int i = 0 ; i < arrLength; i++){
            if (sticks[i] != 0)
            {
                smallestStick = sticks[i];
                break;
            }
        }
        for (int i = 1; i < arrLength; i++)
        {
             if(sticks[i] < smallestStick && sticks[i] != 0){
                    smallestStick = sticks[i];
                }
            
           
        }
        return smallestStick;
    }
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfSticks = input.nextInt();
        int[] sticks = new int[noOfSticks];
        int zeroCounter = 0;
        
        int smallestStick = 0;
        for (int i = 0; i < noOfSticks; i++)
         {
            sticks[i] = input.nextInt();
            if (sticks[i] == 0)
            {
                zeroCounter++;
            }
         }
        
        
       
        while (zeroCounter != noOfSticks)
        {
            int cutCounter = 0;
            smallestStick = getSmallestStick(sticks);
            for (int i = 0 ; i < noOfSticks; i++)
                 {
                    if(sticks[i] > 0)
                    {
                        cutCounter++;
                        sticks[i] = sticks[i] - smallestStick;
                        if(sticks[i] == 0)
                        {
                            zeroCounter++;
                        }
                    }
                   
                 }
            System.out.println(cutCounter);
          
        }
      }
 }
