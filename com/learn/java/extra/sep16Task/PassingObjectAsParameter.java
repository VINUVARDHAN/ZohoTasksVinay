package com.learn.java.extra.sep16Task;
public class PassingObjectAsParameter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Test t1 = new Test(a);
        Test t2 = new Test(b);
        t1.method1(t1);
        t2.method1(t2);
        String n = "vinay";
    }
}
class Test{
    private int val;
    Test(int a)
    {
        val = a;
    }
    void method1(Test t)
    {
        System.out.println(t.val);
    }
    protected void finalize()
    {
        System.out.println("finalized");
    }
}
