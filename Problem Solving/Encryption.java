/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Encryption [https://www.hackerrank.com/challenges/encryption]
 * 
 * 1. Remove the spaces inside the string and find the ceil (b) of square root of its length.
 * 2. Every word of the resultant string should have b length
 * 3. Running two loops to get letters from each unique word of orignal string to form a new word in resultant string
 * 4. All of the stored in an arraylist and later merged wtih space to fully make  the resultant String  
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Encryption {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        String s1=s.replace(" ","");

        //logic
        int b=(int)Math.ceil(Math.sqrt(s1.length()));
        ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<b;i++)
        {   
            String s4=""+s1.charAt(i);
            for(int j=i+b;j<s1.length();j=j+b) s4+=s1.charAt(j);
            al.add(s4);
        }
        String result="";
        Iterator<String> it =al.iterator();
        while(it.hasNext()) result+=it.next()+" ";

        System.out.println(result);
        
        x.close();
    }

}
