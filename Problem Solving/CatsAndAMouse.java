/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Cats and a Mouse [https://www.hackerrank.com/challenges/cats-and-a-mouse]
 * 
 * Distance can be calculated with Math class absolute method as cats can be before or after the mouse in
 * a straight line.
 */
import java.util.Scanner;

class Solution
{
    public static void main (String args[])
    {
       Scanner x1=new Scanner(System.in);
       int q=x1.nextInt();
       int x=0,y=0,z=0,d1=0,d2=0;
       String s="";

       for (int i=0;i<q;i++)
       {
            x=x1.nextInt();
            y=x1.nextInt();
            z=x1.nextInt();

            d1= Math.abs(x-z);
            d2= Math.abs(y-z);
            
            if(d1<d2) s="Cat A";
            else if(d1>d2) s="Cat B";
            else s="Mouse C";

            System.out.println(s);
       }
       x1.close();
    }
}