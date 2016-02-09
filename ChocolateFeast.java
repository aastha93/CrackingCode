/*
Little Bob loves chocolate, and he goes to a store with $N$N in his pocket. The price of each chocolate is $C$C. The store offers a discount: for every MM wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

Input Format: 
The first line contains the number of test cases, TT. 
TT lines follow, each of which contains three integers, NN, CC, and MM.

Output Format: 
Print the total number of chocolates Bob eats.

Constraints: 
1≤T≤10001≤T≤1000 
2≤N≤1052≤N≤105 
1≤C≤N1≤C≤N 
2≤M≤N
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
        int count=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
           
            if(c%n==0)
                {
                count = n/c;
                
            }
            else 
                {
                count=n/c;
            }
            int temp=count;
            while(temp>=m)
                {
                count++;
                temp=temp-m+1;
               }
            
           
            System.out.println(count);
        }
    }
}