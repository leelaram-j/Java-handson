package com.java.practise;

import java.lang.reflect.Array;

public class ArrayMinFetch
{
    public static void main(String[] args)
    {
        int a[] = {4,5,3,-1,10,1};
        int min = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimum number is "+min);
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum number is "+max);
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length)-1;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
//                    temp=a[j];
//                    a[j]=a[i];
//                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
