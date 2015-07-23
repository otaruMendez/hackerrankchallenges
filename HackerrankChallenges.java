/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;
import Library.*;
import java.math.BigInteger;


/**
 *
 * @author engr
 */
public class HackerrankChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        libraryClass usage = new libraryClass();
        
      //  System.out.println(usage.factorial(4));
       
        
         
//        for(int i = 0; i < array.length; i++)
//        {
//            array[i] = input.nextInt();
//        }
//        
//         for(int i = 0; i < array.length-1; i++)
//        {
//            int currentIndex = i;
//            for (int j = i+1; j < array.length; j++)
//            {
//                if (array[i] > array[j])
//                {
//                    int invar = array[currentIndex];
//                    array[i] = array[j];
//                    array[j] = invar;
//                    currentIndex = j;
//                    for (int k = 0; k < array.length; k++)
//                    {
//                        System.out.print(array[k] + " ");
//                    }
//                        System.out.println(" ");
//                }
//            }
        
//          for (int i = 0; i < array.length-1; i++)
//        {
//            if(array[i] > array[i+1])
//            {
//                if (i+1 == array.length-1)
//                {
//                    Vector vecArray = intArrayToVector(array);
//                    for (int j = 0; j < array.length-1; j++)
//                    {
//                        if(array[i+1] < array[j])
//                        {
//                            vecArray.removeElementAt(vecArray.size()-1);
//                            vecArray.add(j, array[i+1]);
//                            break;
//                        }
//                    }
//                     for (int m = 0; m < array.length; m++)
//                     {
//                         System.out.print(vecArray.get(m) + " ");
//                     }
//                     System.out.println("");
//                }
//                else{
//                int invariant = array[i];
//                array[i] = array[i+1];
//                array[i+1] = invariant;
//                
//                for (int m = 0; m < array.length; m++)
//                {
//                     System.out.print(array[m] + " ");
//                }
//                System.out.println("");
//            }
//        }
//            else
//            {
//                for (int m = 0; m < array.length; m++)
//                {
//                     System.out.print(array[m] + " ");
//                }
//                System.out.println("");
//            }
//        }
         BigInteger N = new BigInteger("10");
          BigInteger halfer =  N.divide(new BigInteger("2"));
            BigInteger two = halfer;
         BigInteger val = two.modPow(halfer, new BigInteger("0"));
         System.out.println(val);
        }
    }

