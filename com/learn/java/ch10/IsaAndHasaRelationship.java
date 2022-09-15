package com.learn.java.ch10;

public class IsaAndHasaRelationship {
    public static void main(String[] args) {
        //has a relationship
        Channels ch = new Channels();
        ch.starSports();
        ch.subscription();
    }
}
//is a relationship
class Subscription{
    void subscription()
    {
        System.out.println("Subscription of TV is Tatasky");
    }
}
class Channels extends Subscription{
    void starSports()
    {
        System.out.println("channel name is Star Sports");
    }
}
