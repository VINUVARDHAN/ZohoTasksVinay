package com.learn.java.ch11;

public class OverLoading2 {
    public static void main(String[] args) {
        new A();
        B b = new B();
        b = null;
        System.gc();
    }
}
class A{
	static int u;
	{
		u =10;
	}
	
    A()
    {
    	System.out.println("vfuivuevbkbvkviugfrvc");
        
    }
    protected void finalize()
    {
    	System.out.println("bhfiwyvfew");
    }
    
}
class B extends A{

}