/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Cut The Sticks [https://www.hackerrank.com/challenges/cut-the-sticks]
 * 
 * 1. Taking input as mentioned.
 * 2. arraylist al for result, add starting size of input arraylist.
 * 3. For each iteration we find min of input arraylist using collections.min and substract it from each value in input arraylist.
 * 4. Remove all the 0 values from input Arraylist by using removeAll method and Collections.signleton method.
 * 5. add size of resultant arraylist to al.
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<n;i++) arr1.add(x.nextInt());
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(arr1.size());
        while(!arr1.isEmpty())
        {
            int min=Collections.min(arr1);
            for(int i=0;i<arr1.size();i++) arr1.set(i,arr1.get(i)-min);
            arr1.removeAll(Collections.singleton(0));
            if(!arr1.isEmpty()) al.add(arr1.size());
        }

        al.forEach(p->System.out.println(p));
        x.close();
    }

}
