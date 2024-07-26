/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Angry Professor [https://www.hackerrank.com/challenges/angry-professor]
 * 
 * 1.Check and count number of elements that are less than or equal to zero and compare with threshold.
 * 
 */

import java.util.Scanner;

public class AngryProfessor {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=x.nextInt();
            int k=x.nextInt();
            int a[]=new int [n];
            for(int j=0;j<n;j++) a[j]=x.nextInt();
            int c=0;
            for(int j:a) if(j<=0) c++;
            if (c>=k) System.out.println("NO");
            else System.out.println("YES");
            
        }
        x.close();
    }

}
