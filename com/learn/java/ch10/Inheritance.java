package com.learn.java.ch10;

public class Inheritance {
    public static void main(String[] args) {
        //can change statements 
        Animal a = new Animal();
        a.eat();
        a.walk();
        Bird b = new Bird();
        b.eat();
        b.fly();
    }
}
//single inheritance
class AnimalsAndBirds{
    void eat(){
        System.out.println("All birds and animals will eat");
    }
}
class Bird extends AnimalsAndBirds{
    void fly ()
    {
        System.out.println("Birds can fly");
    }
}
//multilevel inheritance (Parrot class inherits Bird class which inherit from AnimalsAndBirds class)
class Parrot extends Bird{
    void lifespan()
    {
        System.out.println("The life time of parrot is 140 years");
    }
}
//hierarchical inheritance (class Animal and Bird inherit same parent class AnimalsAndBirds)
class Animal extends AnimalsAndBirds{
    void walk()
    {
        System.out.println("Animals can't fly but can scroll and walk");
    }
}
