/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import Library.Graph.*;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class evenTree {
    
    public static void main(String[] args)
    {
         Graph myGraph = new Graph();
        myGraph.setDirected();
        Scanner input = new Scanner(System.in);
        
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        
        for(int i = 0; i < secondNumber; i++)
        {
             Node<Integer> subNode = new Node(input.nextInt());
             Node<Integer> masterNode = new Node(input.nextInt());
            
             myGraph.addNode(masterNode);
             myGraph.addNode(subNode);
             
             Edge connector = new Edge(masterNode, subNode);
             myGraph.addEdge(connector);
             
           }
        
     
    }
}
