package com.java.practise;

public class palindromeCheck
{
    public static void main(String[] args)
    {
        String g = "Lee";
        int l = g.length();
        String t = "";
        for(int i = l-1;i>=0;i--)
        {
            t = t + g.charAt(i);
        }
        System.out.println(t);
        if(g.equalsIgnoreCase(t))
        {
            System.out.println("This is a palindrome");
        }
        else {
            System.out.println("This is not a palindrome");
        }
    }
}
