/*
A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.

Input Format

The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N (students in the class) and K (the cancelation threshold). 
The second line contains N space-separated integers (a1,a2,…,aN) describing the arrival times for each student.

Note: Non-positive arrival times (ai≤0) indicate the student arrived early or on time; positive arrival times (ai>0) indicate the student arrived ai minutes late.

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.

Constraints

1≤T≤10
1≤N≤1000
1≤K≤N
−100≤ai≤100,where i∈[1,N]
Note 
If a student arrives exactly on time (ai=0), the student is considered to have entered before the class started.



*/





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            boolean result[]=new boolean[n];
            for(int i=0;i<n;i++)
                {
                result[i]=true;
            }
            for(int i=0;i<n;i++)
                {
                if(a[i]>0)
                    {
                    result[i]=false;
                }
}
           // System.out.println(Arrays.toString(result));
            int count=0;
            for(int i=0;i<n;i++)
                {
                if(result[i]==true)
                    {
                    count++;
                }
}
           // System.out.println(count);
            //System.out.println(n);
            if(count>=k)
                {
                System.out.println("NO");
                }
            else
                {
                System.out.println("YES");
            }
       
           
           
            
            
        }
    }
}
