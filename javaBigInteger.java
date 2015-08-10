/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author engr
 */
public class javaBigInteger {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger  a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
