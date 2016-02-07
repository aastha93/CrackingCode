/*
Given an integer, N, traverse its digits (d1,d2,...,dn) and determine how many digits evenly divide N (i.e.: count the number of times N divided by each digit di has a remainder of 0). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111, the answer is 3).

Input Format

The first line is an integer, T, indicating the number of test cases. 
The T subsequent lines each contain an integer, N.

Constraints 
1≤T≤15 
0<N<109
Output Format

For every test case, count and print (on a new line) the number of digits in N that are able to evenly divide N.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int rem=n%10;
            int count=0;
            if(n%rem==0)
                {
                count++;
            }
            int div=n/10;
            while(div>0)
                {
                    
                  rem=div%10;
                  if(rem!=0)
                      {
                  if(n%rem==0)
                      {
                      count++;
                  }
                  }
                  div=div/10;
            }
            System.out.println(count);
        }
    }
}