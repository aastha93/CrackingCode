/*
Suppose you have some string SS having length NN that is indexed from 00 to N−1N−1. You also have some string RR that is the reverse of string SS. SS is funny if the condition | S[j]−S[j−1] |=| R[j]−R[j−1] || S[j]−S[j−1] |=| R[j]−R[j−1] | is true for every jj from 11 to N−1N−1.

Note: For some string SS, S[j]S[j] denotes the ASCII value of the jthjth zero-indexed character in SS. The absolute value of some integer xx is written as | x || x |.

Input Format

The first line contains an integer, TT (the number of test cases). 
The TT subsequent lines each contain a string, where the ithith line is string SiSi.

Constraints 
1≤T≤101≤T≤10 
0≤i≤T−10≤i≤T−1 
2≤length of Si≤100002≤length of Si≤10000

Output Format

For each SiSi, print Funny or Not Funny on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        for(int i=1;i<=t;i++)
            {
            String s= scan.next();
            int k=s.length();
            int l=k-1;
            int flag=0;
            for(int j=0;j<k;j++)
                {
                 
                 
                   if(j+1<=k-1&&l-1>=0)
                   {
                       int m = (int)s.charAt(j);
                     int n=(int)s.charAt(j+1);
                         int diff1=Math.abs(n-m);
                     //  System.out.println(diff1);
                  int p=s.charAt(l);
                  int q=s.charAt(l-1);
                int diff2=Math.abs(q-p);
                      // System.out.println(diff2);
                if(diff1!=diff2)
                    {
                   // System.out.println("yes");
                    flag=1;
                    
                    }
                   }
                
                l--;
                    
            }
            if(flag==0)
                {
                System.out.println("Funny");
            }
            else
                {
                System.out.println("Not Funny");
            }
        }
      
    }
}