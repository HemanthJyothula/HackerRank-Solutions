/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Library Fine [https://www.hackerrank.com/challenges/library-fine]
 * 
 * 1. simple compare numbers problem.
 * 
 */

import java.util.Scanner;
public class LibraryFine {
    public static void main (String args[])
    {   
        Scanner x=new Scanner(System.in);
        int d1=x.nextInt();
        int m1=x.nextInt();
        int y1=x.nextInt();

        int d2=x.nextInt();
        int m2=x.nextInt();
        int y2=x.nextInt();

        int fine=0;
        if(y1>y2) fine=10000;
        else if(y1==y2)
        {   
            if(m1<m2) fine=0;
            else if( m1==m2) 
            {
                if(d1>d2) fine=15*(d1-d2);
                else fine=0;
            }
            else if( m1>m2) fine=500*(m1-m2);
        }
        else fine=0;
        System.out.println(fine);
        x.close();
    }
}
