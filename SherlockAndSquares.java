import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m =in.nextInt();
            int count=0;
            for(int i=n;i<=m;i++)
                {
               long temp=(long)Math.sqrt(i);
                if(temp*temp==i)
                    {
                    count++;
                }
                
            }
            System.out.println(count);
        }
    }
}