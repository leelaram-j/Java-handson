package com.java.practise;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("testuser");
        a.add("java");
        System.out.println(a);
        a.add(0,"zero");
        System.out.println(a);
//        a.remove(1);
//        System.out.println(a);
//        a.remove("java");
//        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("testing"));
        System.out.println(a.contains("java"));
        System.out.println(a.indexOf("java"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());

    }
}
