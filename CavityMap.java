/*
You are given a square map of size n×nn×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, nn, denoting the size of the map. Each of the following nn lines contains nn positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1≤n≤1001≤n≤100
Output Format

Output nn lines, denoting the resulting map. Each cavity should be replaced with character X.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
      // System.out.println(grid[0].charAt(0));
        StringBuilder sb = new StringBuilder();
        String matrix[][] = new String[n][n];
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                   int current= Character.getNumericValue(grid[i].charAt(j));
                   if(i!=0&&j!=0&&i!=n-1&&j!=n-1)
                       {
                       
                       int next= Character.getNumericValue(grid[i].charAt(j+1));
                       if(current>next)
                           {
                           matrix[i][j]="X";
                       }
                       else 
                           {
                           matrix[i][j]=Integer.toString(current);
                       }
                   }
                else
                    {
                    matrix[i][j]=Integer.toString(current);
                }
                
            }
        }
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}