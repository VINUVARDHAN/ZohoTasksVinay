//$Id$
package com.learn.java.DateUtility;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // LocalDate class have private constructor
        LocalDate t1 = LocalDate.now();
        System.out.println("Today's date is : " + t1);

        LocalDate t2 = LocalDate.of(2000, 7, 28);
        System.out.println("Changed Date :" + t2);

        LocalDate previousDate = t1.minusDays(1);
        System.out.println("Yesterday date : " + previousDate);
    }
}
