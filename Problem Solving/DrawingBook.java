/**
 * Problem Statement - https://www.hackerrank.com/challenges/drawing-book/
 * @author - HemanthJyothula
 */
import java.util.*;
public class DrawingBook 
{
    public static void main (String args[])
    {   
        // Reading inputs using Scanner
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int p=x.nextInt(); 

        // variable 'f' for storing number of page flips
        // temporary variable 't' for storing number of pages 
        int f=0,t=0;

        // logic to count flips if required page number is close to last page
        if(p>n/2)
        {
            t=n;
            // if even number of pages then increment flips by 1 as book ends with even page of left
            if(n%2==0 && p!=n) 
            { 
                t--;
                f++;
            }
            // for every two pages 1 flip is required.
            while(t>p) 
            {
                if(p==t || p== t-1) break;
                else 
                {
                    f++;
                    t-=2;
                }
            }
        }
        // logic to count flips if required page number is close to the first page
        if(p<=n/2)
        {
            t=1;
            while(t<p) 
            {
                if(p==t || p== t-1) break;
                else 
                {
                    f++;
                    t+=2;
                }
            }
        }
        System.out.println(f);
    }
    
}
