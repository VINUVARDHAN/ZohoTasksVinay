package com.learn.java.C12_EnumAnnotationAutoboxing;

public enum DAYS {
    sun(10),
    mon(20),
    tue(30);
    public int rating;
    DAYS(int rating)
    {
        this.rating = rating;
    }
}
//MONTH can't be access outside the package because it is default
enum MONTH{
    jan,feb,mar,apr,may,jun,july,aug,sep,oct,nov,dec;
    public static void main(String[] args) {  
        MONTH s=MONTH.feb;  
        System.out.println(s);  
        }  
}
