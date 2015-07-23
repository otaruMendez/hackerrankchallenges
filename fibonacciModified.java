/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class fibonacciModified {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int termToFind = input.nextInt();
        BigInteger bgFirstNumber = new BigInteger(Integer.toString(firstNumber));
        BigInteger bgSecondNumber = new BigInteger(Integer.toString(secondNumber));
        BigInteger invariant;
        for(int i = 0; i < termToFind-2; i++)
        {
            invariant = (bgSecondNumber.multiply(bgSecondNumber)).add(bgFirstNumber);
            bgFirstNumber = bgSecondNumber;
            bgSecondNumber = invariant;
        }
        System.out.println(bgSecondNumber);
//        long firstNumber = input.nextInt();
//        long secondNumber = input.nextInt();
//        int termToFinf = input.nextInt();
//        Vector<Long> values = new Vector<>();
//        values.add(firstNumber);
//        values.add(secondNumber);
//        for (int i = 0; i < termToFinf; i++){
//         long nextTerm = (values.get(i+1)*values.get(i+1)) + (values.get(i));
//        values.add(nextTerm);
//        }
//        System.out.println(values.get(termToFinf-1));
       
    }
}
