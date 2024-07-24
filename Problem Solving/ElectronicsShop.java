/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Electronic Shop [https://www.hackerrank.com/challenges/electronics-shop]
 * 
 *  budget should be greater than minimum of both keyboard and drives prices and their minimum prices sum
 *  return -1 if above condition fails or return max sum value which is less than budget ( iterate all possibel combinations of array)
 */

import java.util.Arrays;
import java.util.Scanner;
public class ElectronicsShop {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int b=x.nextInt();
        int y=x.nextInt();
        int z=x.nextInt();
        int a1[]=new int[y];
        int a2[]=new int[z];
        for(int i=0;i<y;i++) a1[i]=x.nextInt();
        for(int i=0;i<z;i++) a2[i]=x.nextInt();
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        int max=0;
        if( a1[0]>=b || a2[0]>=b || a1[0]+a2[0]>b) max=-1;
        else 
        {
            for(int i=0;i<a1.length;i++) for(int j=0;j<a2.length;j++) if(a1[i]+a2[j]<=b && max<a1[i]+a2[j]) max=a1[i]+a2[j];
        }
       
        x.close();
        System.out.println(max);
        
    }
    
}
