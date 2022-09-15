package com.learn.java.ch7;
import java.util.*;;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number  = sc.nextInt();
        String Number = String.valueOf(number);
        int length = Number.length();
        int total = 0;
        for(int i=0;i<length;i++)
        {
            total +=Math.pow(Character.getNumericValue(Number.charAt(i)), length);
        }
        if(total==number)
        System.out.println("the number is armstrong number : "+total);
        else
        System.out.println("the number is not armstrong number : " + total);
        sc.close();
}
}
