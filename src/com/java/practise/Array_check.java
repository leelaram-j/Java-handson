package com.java.practise;

import java.util.Arrays;

public class Array_check
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2},{2,3},{3,4},{4,5}};
        int b=a.length;
        int c=a[0].length;
        System.out.println(b);
        System.out.println(c);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println(Arrays.deepToString(a));
    }
}
