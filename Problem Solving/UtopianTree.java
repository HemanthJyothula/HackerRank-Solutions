/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Utopian Tree [https://www.hackerrank.com/challenges/utopian-tree]
 * 
 * 1.for every odd cycle it doubles its height , for every even cycle its height increased by 1m.
 * 
 */
import java.util.Scanner;
public class UtopianTree {
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int j=0;j<t;j++)
        {   
            int n=x.nextInt();
            int h=1;
            for(int i=1;i<=n;i++)
            {
                 if(i%2!=0) h*=2;
                else h+=1;
            }
            System.out.println(h);
        }
        x.close();
    }

}
