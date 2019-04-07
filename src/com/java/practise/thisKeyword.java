package com.java.practise;

public class thisKeyword
{
    int a=2;
    public void getData()
    {
        int a=3;
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args)
    {
        thisKeyword tk = new thisKeyword();
        tk.getData();
    }
}
