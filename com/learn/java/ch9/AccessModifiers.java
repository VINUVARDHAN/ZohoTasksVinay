package com.learn.java.ch9;

class AccessModifiers{
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();
        modifiers.publicmethod();
        /*  This function can't be called by the class because it 
            belongs only to that particular class and subclasses
         *  modifiers.privateMethod();
         */
        modifiers.protectedMethod();
    }
}
//class to represents different access modifiers
class Modifiers{
    //public method
    public void publicmethod()
    {
        System.out.println("i am public method");
    } 
    //private method
    private void privateMethod()
    {
        System.out.println("i am private method");
    }
    //protected method
    protected void protectedMethod()
    {
        this.privateMethod();
        System.out.println("i am protected method");
    }
}