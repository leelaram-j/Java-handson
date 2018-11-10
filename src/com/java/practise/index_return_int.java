package com.java.practise;

public class index_return_int
{
    public static void main(String[] args)
    {
        int a[] = {3,2,5,7,9,4,21};
        //eg 4th position
        for(int i=0;i<a.length;i++)
        {
            if(i==(4-1))
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
