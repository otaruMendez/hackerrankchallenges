/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;


import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author engr
 */
public class quicksortInPlace {
 
    
    ///// Lomuto Partitioning 
    
    static void quickSortLomutoPartitioning(List<Integer> values)
    {
        
       int pivot = values.get(values.size()-1);
       List<Integer> iteratingList = values;
       int counter1 = 0;
       int counter2 = 0;
       for (int i = 0; i < iteratingList.size(); i++)
       {
           if (pivot > iteratingList.get(i))
           {
               int val = values.get(i);
               values.remove(values.get(i));
               values.add(counter1, val);
               counter1++;
               
           }
          
           
//           else if (pivot < iteratingList.get(i))
//           {
//               int val = values.get(i);
//               values.remove(values.get(i));
//               values.add(values.size()-1,val);
//              // counter2++;
//                 for (int a:values)
//                 {
//                    System.out.print(a + " ");
//                 }
//                 System.out.println("");
//           }
       }
           values.remove(values.get(values.size()-1));
           values.add(counter1, pivot);
       
            for (int a:values)
               {
                    System.out.print(a + " ");
               }
                System.out.println("");
                
                
                
//       for (int i:values)
//       {
//           System.out.println(i);
//       }
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        
        int noOfItems = input.nextInt();
        
        for (int i = 0; i < noOfItems; i++)
            
        {
            values.add(input.nextInt());
        }
        
        quickSortLomutoPartitioning(values);
        
    }
//    {
    
//    static void quickSort(List<Integer> items)
//    {
//        if(items.size() > 1)
//        {
//        List<Integer> smaller = new ArrayList<>();
//        List<Integer> same = new ArrayList<>();
//        List<Integer> larger = new ArrayList<>();
//        
//       
//        Integer chosenitem = items.get(0);
//        
//        for(Integer i : items)
//        {
//            if(i < chosenitem)
//            {
//                smaller.add(i);
//            }
//            else if(i > chosenitem)
//            {
//                larger.add(i);
//            }
//            else
//            {
//                same.add(i);
//            }
//        }
//        
//        quickSort(smaller);
//        quickSort(larger);
//        
//        items.clear();
//        items.addAll(smaller);
//        items.addAll(same);
//        items.addAll(larger);
//        
//       
//    }
//         for (int i : items)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//      //  return items;
//    }
//    
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//       
//        List<Integer> values = new ArrayList<>();
//        
//        int noOfItems = input.nextInt();
//        
//        for (int i = 0; i < noOfItems; i++)
//            
//        {
//            values.add(input.nextInt());
//        }
//        
//        int pivot = values.get(values.size()/2);
//        
//       
//        
//       
        
                
        
        
    }

