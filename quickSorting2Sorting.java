/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import Library.inputClass;
import Library.libraryClass;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author engr
 */
public class quickSorting2Sorting {
    
    void quickSort2(int[] arrayI)
    {
        
        
        ArrayList<Integer> leftSide = quickSort1(arrayI).get(0);
        ArrayList<Integer> rightside = quickSort1(arrayI).get(1);
        //ArrayList<ArrayList> outpu = new ArrayList();
         int[] leftsid = new Library.libraryClass().collectionToArray(leftSide);
          int[] rightsid = new Library.libraryClass().collectionToArray(rightside);
        
        if(!(leftSide.isEmpty() || rightside.isEmpty()))
        {
            leftsid = new Library.libraryClass().collectionToArray(leftSide);
            rightsid = new Library.libraryClass().collectionToArray(rightside);
            quickSort1(leftsid);
            quickSort1(rightsid);
           
         }
        else
        {
           new libraryClass().printArray(leftsid);
           new libraryClass().printArray(rightsid);
           
        }
       
    }
    
    ArrayList<ArrayList> quickSort1(int[] array)
    {
         int noOfItems = array.length;
        int firstItem = array[0];
        ArrayList<Integer> toTheLeft = new ArrayList();
        ArrayList<Integer> toTheRight = new ArrayList();
       // ArrayList<Integer> midNumber = new ArrayList<>();
        //midNumber.add(firstItem);
        for (int i = 1; i < noOfItems; i++)
        {
           int val = array[i];
           if(val > firstItem)
           {
               toTheRight.add(val);
           }
           else
           {
               toTheLeft.add(val);
           }
        }
        
       ArrayList<ArrayList> list = new ArrayList<>();
       list.add(toTheLeft);
       list.add(toTheRight);
      // list.add(midNumber);
       
       return list;
  }
    
    public static void main(String[] args)
    {
        inputClass inpu = new inputClass();
        quickSorting2Sorting val = new quickSorting2Sorting();
        Scanner inScanner = new Scanner(System.in);
        int[] array = inpu.takeArryInt(inScanner.nextInt());
        val.quickSort2(array);
        
    }
    
    
   
}
