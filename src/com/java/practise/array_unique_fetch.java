package com.java.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;

public class array_unique_fetch
{
    public static void main(String[] args)
    {
        int a[] = {2,3,4,5,6,78,3,6,2,8,5,4,8};
        int uniq=0;
        ArrayList al = new ArrayList();
        for(int i=0;i<a.length;i++)
        {
            int k=0;
            if(!al.contains(a[i]))
            {
                al.add(a[i]);
                k++;
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        k++;
                    }
                }
                System.out.println(a[i]+" is present "+k+" times");

            }
            if(k==1)
            {
                uniq=a[i];
            }

        }
        System.out.println("Unique number is "+uniq);
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
