/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Beautiful Triplets [https://www.hackerrank.com/challenges/beautiful-triplets]
 * 
 * 1. Three variables in for loops i,j,k starts with one more than the next one as given in the problem in the question
 * 2. Checks for the  condition arr[j]<arr[i]==d==arr[k]-arr[j]. if satisfies increase triplets by 1.
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulTriplets {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int d=x.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++) arr.add(x.nextInt());

        int triplets=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(j)-arr.get(i)==d)
                {
                    for(int k=j+1;k<arr.size();k++) 
                        if (arr.get(k)-arr.get(j)==d) triplets++;
                }
            }
        }

        System.out.println(triplets);
        x.close();
    }

}
