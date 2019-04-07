package com.java.practise;

public class ChildClass extends parentClass
{
    String name="childclasstester";
    public void getData()
    {
        super.getData();
        System.out.println(name);
        System.out.println(super.name);
    }
    public ChildClass()
    {
        super();
        System.out.println("In Child class constructor");
    }
    public static void main(String[] args)
    {
        ChildClass cc = new ChildClass();
        cc.getData();

    }
}
