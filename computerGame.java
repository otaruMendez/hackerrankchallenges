/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class computerGame {
    
    static boolean isPrime(int n)
    {
        boolean result = true;
        if(n == 2 || n == 3|| n==5|| n==7)
        {
            result = true;
        }else
        {
            for(int i = 2; i < 9; i++)
            {
                if(n%i == 0)
                {
                    result = false;
                    break;
                }
            }
        }
              return result;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Vector<Integer> arra1 = new Vector();
        Vector<Integer> arra2 = new Vector();
        int counter = 0;
        int noOfElements = input.nextInt();
        
        
        for(int i = 0; i < noOfElements; i++)
        {
            arra1.add(input.nextInt());
        }
        for(int i = 0; i < noOfElements; i++)
        {
            arra2.add(input.nextInt());
        }
        
        for(int i = 0; i < noOfElements; i++)
        {
           // System.out.println(arra1.get(i) + "--- " +arra2.get(i));
            if(isPrime(arra1.get(i)) || isPrime(arra2.get(i)))
            {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}
