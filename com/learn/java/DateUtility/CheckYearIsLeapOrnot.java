//$Id$
package com.learn.java.DateUtility;

import java.util.Date;

public class CheckYearIsLeapOrnot {
    public static void main(String[] args) {
        Date m = new Date();
        int year = m.getYear();
        if(year%4==0)
        {
            System.out.println("The present year is leap year");
        }
        else
        {
            System.out.println("The present year is not a leap");
        }
    }
}
