package com.learn.java.ch7;
public class ArmStrongFom100To999 {
public static void main(String[] args) {
    for(int i=100;i<1000;i++)
    {
        ArmStrong(i);
    }
}
public static void ArmStrong(int number)
{
        String Number = String.valueOf(number);
        int length = Number.length();
        int total = 0;
        for(int i=0;i<length;i++)
        {
            total +=Math.pow(Character.getNumericValue(Number.charAt(i)), length);
        }
        if(total==number)
        System.out.print(total+"  ");
}
}
