/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Counting Valleys [https://www.hackerrank.com/challenges/counting-valleys]
 */
import java.util.Scanner;
public class CountingValleys{
    public static void main (String []args)
    {   
        // Taking inputs using Scanner
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        String s=x.next();
        
        // converting string to character array for comparison and logic
        char a[]=s.toCharArray();

        //  Declared two variables 'sl' and 'c' for sea level and valley count
        int sl=0,c=0;

        for(int i=0;i<n;i++)
        {
            // increasing or decreasing sea level as per steps
            if(a[i]=='D') sl--; 
            else 
            {
                if(sl+1==0) c++; // counting as a valley whenever the sea lavel goes to zero from neagtive 
                sl++;
            }
        }
        x.close();
        System.out.println(c);
    }
}
