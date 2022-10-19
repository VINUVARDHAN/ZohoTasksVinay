package com.learn.java.chapter6;

public class ObjectOverloadingOverriding {
	public static void main(String args[]) throws Throwable
	{
		Object obj = new Object();
		ObjectOverloadingOverriding obj2=new ObjectOverloadingOverriding();
		A a = new A();
		A a1 = new B();
		B b = new B();
		A a2= new C();
		b.method(b);
		//tostring
		obj2.finalize();
		String s = a.toString();
		System.out.println(s);
		System.out.println(a);
		//getclasses
		System.out.println(a.getClass());
		};
	}
class A{
	void method(A b)
	{
		System.out.println("object method    ");
		//output of below will be overriding 
		b.methodb();
	}
	void method(int i)
	{
		System.out.println("integer method");
	}
	void methodb()
	{
		System.out.println("method b in A");
	}

}

class B extends A{
	void methodb()
	{
		System.out.println("method b in B");
	}
	void method(int i)
	{
		System.out.println("B method");
	}
}
class C extends B{
	void method(int i)
	{
		System.out.println("C method");
	}
}