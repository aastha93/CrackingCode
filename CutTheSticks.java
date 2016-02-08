/*

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following: 
3 2 2 6

The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer N. 
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.

Constraints 
1 ≤ N ≤ 1000 
1 ≤ ai ≤ 1000
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int min(int [] arr)
        {
         int mini=arr[0];
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]<mini&&arr[i]!=0)
                {
                mini=arr[i];
            }
            if(mini==0)
                {
               if(arr[i]>mini)
                   {
                   mini=arr[i];
               }
            }
        }
        return mini;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            }
          
        int count=0;
        
        int minimum=min(arr);
        while(minimum>0)
            {
           
              count=0;
           for(int i=0;i<n;i++)
            {
            if(arr[i]>=1)
                {
                arr[i]=arr[i]-minimum;
                count++;
            }
               
                
        }
            System.out.println(count);
          
            minimum=min(arr);
            //System.out.println("min"+minimum);
        }
       
        
    }
}
