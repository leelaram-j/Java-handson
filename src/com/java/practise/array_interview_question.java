package com.java.practise;

public class array_interview_question
{
    public static void main(String[] args)
    {
        int a[][] = {{2,4,5},{3,0,7},{1,2,9}};
        int min = a[0][0];
        int column=0;
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]<min)
                {
                    min = a[i][j];
                    column = j;
                }
            }
        }
        max =a[0][column];
        for(int i=0;i<a.length;i++)
        {
            if(a[i][column]>max)
            {
                max= a[i][column];
            }
        }
        System.out.println("Maximum number is "+max);

    }
}
