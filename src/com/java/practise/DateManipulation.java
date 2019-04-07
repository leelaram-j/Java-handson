package com.java.practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulation
{
    public  static void main(String[] args)
    {
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
        System.out.println(sdf.format(d));
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
        System.out.println(sdf1.format(d));
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
        System.out.println(sdf2.format(d));
    }

}
