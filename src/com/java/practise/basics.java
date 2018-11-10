package com.java.practise;

public class basics
{
    public  static void main(String[] args)
    {
        String str = "Payment $700 received";
        str.equals("abc");
        str.contains("abc");
        str.equalsIgnoreCase("abc");
        str.charAt(2);
        int a = str.compareTo("abc");
        System.out.println(a);
        str.contains("abc");
        Boolean b = str.contentEquals("abc");
        str.replace("a","e");
        str.split(",");
        System.out.println(b);
        str.substring(3);
        str.toLowerCase();
        str.toUpperCase();
        str.trim();
    }
}
