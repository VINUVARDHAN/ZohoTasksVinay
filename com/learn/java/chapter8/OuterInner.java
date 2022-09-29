package com.learn.java.chapter8;
public class OuterInner{
    public static void main(String[] args) {
        C1 c1 = new C1();
        C1.C2 c2 = c1.new C2();
        C1.C2.C3 c3 = c2.new C3();

    }
}
class C1{
    C1()
    {
        System.out.println("C1 constructor");
    }
     void c1m()
    {
        System.out.println("c1 method");
    }
    void m()
    {
        System.out.println("m in C1");
    }
    class C2{
        C2()
        {
            System.out.println("C2 constructor");
            c1m();
            c2m();
        }
        void c2m()
        {
            System.out.println("c2 method");
        }
         void m()
        {
            System.out.println("m in C2");
        }
        class C3{
            C3(){
                System.out.println("C3 constructor");
                c1m();
                c2m();
                c3m();
            }
            void c3m()
            {
                System.out.println("c3 method");
            }
            void m()
            {
                System.out.println("m in C3");
            }
        }
    }
}