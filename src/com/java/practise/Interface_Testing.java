package com.java.practise;

public class Interface_Testing implements interface_1
{
    public static void main(String[] args)
    {
        Interface_Testing d = new Interface_Testing();
        d.getData();
        d.putData();
        d.reset();
    }

    @Override
    public void getData()
    {
        System.out.println("getData method");
    }

    @Override
    public void putData()
    {
        System.out.println("putData method");
    }

    @Override
    public void reset()
    {
        System.out.println("reset method");
    }
}
