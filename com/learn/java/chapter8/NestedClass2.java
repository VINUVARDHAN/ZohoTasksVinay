package com.learn.java.chapter8;

public class NestedClass2{
    public static void main(String[] args) {
        Outer.InnerStatic staticInner = new Outer.InnerStatic();
        Outer outer = new Outer();
        Outer.InnerNonStatic nonStaticInner = outer.new InnerNonStatic();
        //you can't access the outerclass members using the instance variable of inner class

    }
}

class Outer{
    int varNonStatic;
    static int varStatic;
     Outer(){
        System.out.println("outer constructor");
    }
    void m1()
    {
        System.out.println("m1 non static method of outer");
    }
    static void m2()
    {
        System.out.println("m2 static method of outer");
    }
    class InnerNonStatic {
        InnerNonStatic()
        {
            System.out.println("Non static constructor");
        }
        void m3()
        {
            m1();
            m2();
            System.out.println("m3 non static method of non static inner class");
        }
        //we cannot create a static method inside the non static inner class
        //static void m4()
        //{
        //    System.out.println("m4 non static method of non");
        //}
        class C1{

        }
    }
    static class InnerStatic{
        static int m = 10;
        InnerStatic(){
            System.out.println("static constructor");
        }
        void m4()
        {
            m2();
            System.out.println("m4 non static method inside the static class");
        }
        static void m5()
        {
            m2();
            System.out.println("m5 static method inside the static class");
        }
        //create a non static class inside the static class
        class C1{

        }
        static class C2{

        }
    }
}