package com.learn.java.ch11;

import java.util.Scanner;

public class OverRiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pens you want : ");
        int count = sc.nextInt();
        System.out.println("Select which pen brand you want \n1 : Nataraja\n2 : Artline\n3 : Writo");
        System.out.print("Type their Serial number : ");
        int value = sc.nextInt();
        switch(value){
            case 1:Nataraja na = new Nataraja();
                   na.cost(count);
            break;
            case 2:Artline ar = new Artline();
                   ar.cost(count);
            break;
            //Writo class does not have method "cost" but parent class have that method
            case 3:Writo wr = new Writo();
                   wr.cost(count);
            break;
            default:
            System.out.println("Entered number is invalid");
        }
        sc.close();
    }
}

class Pen{
    void cost(int count)
    {
        System.out.println("Default cost of pen is : 5");
        System.out.println("Total cost for "+count+" pens will be "+(5*count));
    }
}
class Nataraja extends Pen{
    void cost(int count)
    {
        System.out.println("Cost of each Nataraja pen is : 20");
        System.out.println("Total cost for "+count+" pens will be "+(20*count));
    }
}
class Artline extends Pen{
    void cost(int count)
    {
        System.out.println("Cost of each Artline pen is : 10");
        System.out.println("Total cost for "+count+" pens will be "+(10*count));
    }
}
class Writo extends Pen{

}
