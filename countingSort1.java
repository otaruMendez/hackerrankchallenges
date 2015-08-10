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
public class countingSort1 {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfElements = input.nextInt();
        
        int[] finalArray = new int[noOfElements];
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> values2 = new ArrayList<>();
        
        for (int i = 0; i < noOfElements; i++)
        {
            values.add(input.nextInt());
        }
        
        while(values.size() > 0)
        {
            int firstElemt = values.get(0);
            int counter = 0;
            for(int i = 0; i < values.size(); i++)
            {
                if (values.get(i) == firstElemt)
                {
                    values.remove(values.get(i));
                    counter++;
                }
                
                finalArray[firstElemt] = counter;
            }
        }
        
        for (int i:finalArray)
        {
            System.out.print(i + " ");
        }
    }
}
