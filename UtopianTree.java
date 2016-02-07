/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after N growth cycles?

Input Format

The first line contains an integer, T, the number of test cases. 
T subsequent lines each contain an integer, N, denoting the number of cycles for that test case.

Constraints 
1≤T≤10 
0≤N≤60
Output Format

For each test case, print the height of the Utopian Tree after N cycles. Each height must be printed on a new line.
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
            int ht=1;
            int n = in.nextInt();
            if(n==0)
                {
                System.out.println("1");
            }
            if(n>=1)
                {
                for(int i=1;i<=n;i++)
                    {
                    if(i%2!=0)
                        {
                        ht=ht*2;
                    }
                    else
                        {
                        ht=ht+1;
                    }
                }
                System.out.println(ht);
            }
            
        }
    }
}