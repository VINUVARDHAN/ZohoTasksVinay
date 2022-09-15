package com.learn.java.ch4;
import java.util.Scanner;;
public class DenominationOfGivenNumber {
    public static void main(String[] args) {
        int Amount[] = {2000,500,100,50,10,1};
        int Cash[]  = {0,0,0,0,0,0};
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the amount: ");
        int length = Amount.length;
        int amount = sc.nextInt();
        int finalCash=0;
        for(int i=0;i<length;i++){
            while(finalCash<=amount){
                finalCash = finalCash + Amount[i];
                Cash[i] ++;
                if (finalCash>amount)
                {
                    finalCash = finalCash - Amount[i];
                    Cash[i] --;
                    break;
                }
            }
        }
        for (int i=0;i<length;i++)
        {
            System.out.println(Amount[i]+"*"+Cash[i]+" = "+Amount[i]*Cash[i]);
        }
        System.out.println("Total = "+amount);
        sc.close();
    }
}
