/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Designer PDF Viewer [https://www.hackerrank.com/challenges/designer-pdf-viewer]
 * 
 * 1. Reducing operations by converting letter strings to a set.
 * 2. Using iterator to traverser all unique elements and find their respective height
 *    from given height array which is stored in b.
 * 3. Length is the number of characters in given string.
 * 
 */

import java.util.*;
import java.util.stream.Collectors;
public class DesignerPDFViewer {
    public static void main (String []args)
    {
        Scanner x=new Scanner(System.in);
        int a[]=new int[26];
        for(int i=0;i<26;i++) a[i]=x.nextInt();
        String s=x.next();

        String[] sp=s.split("");
        Set<String> ss= Arrays.stream(sp).collect(Collectors.toSet());
        int l=s.length();
        int b=0;
        Iterator<String> it=ss.iterator();
        while(it.hasNext())
        {
            String c=it.next();
            int temp=a[(int)c.charAt(0) - 97];
            if(b<=temp) b=temp;
            
        }

        System.out.println(l*b);

        x.close();
    }

}
