/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;
import Library.Graph.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class shortestReach {
    
//    int shortestPathBtwTwoNodes(Node a,Node b, int startingPoint, Graph myGraph)
//    {
//        ArrayList newOne = new ArrayList();
//        ArrayList second = new ArrayList();
//        Vector<Edge> allEdges = myGraph.getEdges();
//        int invariant = 0;
//        int checker  = 0;
//        for (Edge val:allEdges)
//        {
//            if(val.returnHead() == startingPoint)
//            {
//                if(val.returnTail() == null)
//                {
//                    newOne.add(val.returnTail());
//                }
//            }
//            second = newOne;
//            newOne.clear();
//            for(Object no:second)
//            {
//               
//                for(Edge va:allEdges)
//                {
//                    if (va.returnHead() == va)
//                    {
//                        if(val.returnTail() ==  null)
//                        {
//                            newOne.add(val.returnTail());
//                        }
//                    }
//                }
//            }
//        }
//      
//        
//    }
    
    
    public static void main(String[] args)
    {
        Graph newClass = new Graph();
       // newClass.setDirected();
        Scanner input = new Scanner(System.in);
        int noTestcases = input.nextInt();
        int noOfNodes = input.nextInt();
        int noOfVertices = input.nextInt();
        
        int[] nodeKeeper1 = new int[noOfNodes];
        int[] nodeKeeper2  = new int[noOfNodes];
        int[] distanceBtwNodes = new int[noOfNodes];;
        
        for (int i= 0; i < noTestcases; i++)
        {
             for (int j= 0; j < noOfNodes; j++)
            {
                nodeKeeper1[i] = input.nextInt();
                nodeKeeper2[i] = input.nextInt();
                distanceBtwNodes[i] = input.nextInt();

                Node one = new Node(nodeKeeper1[i]);
                Node two = new Node(nodeKeeper2[i]);

                Edge connector = new Edge(one, two);
                newClass.addEdge(connector);
            }
            
        }
        
        Vector<Edge> values = newClass.getEdges();
        int counter = 0;
        for (Edge val:values)
        {
           
            if (val.returnHead() == 1)
            {
               counter += Integer.parseInt(val.returnTail().toString());
                
            }
           
        }
        System.out.println(counter);
    }
}
