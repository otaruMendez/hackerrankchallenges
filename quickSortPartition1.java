/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author engr
 */
public class quickSortPartition1 {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfItems = input.nextInt();
        int firstItem = input.nextInt();
        ArrayList<Integer> toTheLeft = new ArrayList();
        ArrayList<Integer> toTheRight = new ArrayList();
        for (int i = 1; i < noOfItems; i++)
        {
           int val = input.nextInt();
           if(val > firstItem)
           {
               toTheRight.add(val);
           }
           else
           {
               toTheLeft.add(val);
           }
        }
        ArrayList<Integer> list = toTheLeft;
        list.add(firstItem);
        list.addAll(toTheRight);
        
        for(int t:list)
        {
            System.out.print(t + " ");
        }
        System.out.println("");
    }
}
