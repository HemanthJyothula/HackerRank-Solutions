/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Sequence Equation [https://www.hackerrank.com/challenges/permutation-equation]
 * 
 * 1. Taking another array to find max and min of the range
 * 2. for the range checking the given conditon [b[j]-1]==loop variable?
 * 3. If yes adding to the list res and printing each element using forEach Method
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SequenceEquation{
    public static void main(String args[])
    {   
        Scanner x=new Scanner(System.in);

        //input
        int n=x.nextInt();
        int b[]=new int [n];
        for(int i=0;i<n;i++) b[i]=x.nextInt();

        //logic
        int p[]=b.clone();
        Arrays.sort(p);
        ArrayList <Integer> res=new ArrayList<Integer>();
        for(int i=p[0];i<=p[n-1];i++)
            for(int j=0;j<b.length;j++) if (b[b[j]-1]==i) res.add(j+1);

        // Output
        res.forEach(y->System.out.println(y));
        
        x.close();
    }
    
}
