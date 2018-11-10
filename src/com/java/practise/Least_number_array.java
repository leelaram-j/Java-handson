package com.java.practise;

public class Least_number_array
{
    public static void main(String[] args)
    {
        int a[][] = {{2,3,4},{5,1,1}};
        int min=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]<=min)
                {
                    min = a[i][j];
                }
            }
        }
        System.out.println("minimum values is "+min);
        int max=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>max)
                {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Maximum value is "+max);

    }
}
