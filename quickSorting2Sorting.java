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
public class quickSorting2Sorting {

    
     static void quickSort(ArrayList<Integer> items)
    {
        if(items.size() > 1)
        {
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> same = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        
       
        Integer chosenitem = items.get(0);
        
        for(Integer i : items)
        {
            if(i < chosenitem)
            {
                smaller.add(i);
            }
            else if(i > chosenitem)
            {
                larger.add(i);
            }
            else
            {
                same.add(i);
            }
        }
        
        quickSort(smaller);
        quickSort(larger);
        
        items.clear();
        items.addAll(smaller);
        items.addAll(same);
        items.addAll(larger);
        
        for (int i : items)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
       
    }
        
    }
   
    public  static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfElements = input.nextInt();
        ArrayList<Integer> items = new ArrayList<>();
        
        for (int i = 0; i < noOfElements; i++)
        {
            items.add(input.nextInt());
        }
        
       quickSort(items);
        
       
       
    }
}
