package com.java.practise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("India");
        hs.add("Israel");
        hs.add("India");
        hs.add("he");
        hs.add("she");
        hs.add("that");
        System.out.println(hs);
        hs.remove("India");
        hs.isEmpty();
        hs.size();
        Iterator<String> i =hs.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        while(i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}
