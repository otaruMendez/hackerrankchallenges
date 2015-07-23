/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;
import Library.libraryClass;
import java.util.Vector;
import javax.sound.midi.Soundbank;

/**
 *
 * @author engr
 */
public class introToTutorialChallenges_sorting {
    
     public static Vector intArrayToVector(int[] intArray)
    {
        Vector result = new Vector();
        for (int i = 0; i < intArray.length; i++)
        {
           result.add(intArray[i]);
        }
         return result;
    }
     
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noTolookFor = input.nextInt();
        int noOfElements = input.nextInt();
        int[] values = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++)
        {
            values[i] = input.nextInt();
        }
        Vector value = intArrayToVector(values);
        
         System.out.println(value.indexOf(noTolookFor));
        
    }
}
