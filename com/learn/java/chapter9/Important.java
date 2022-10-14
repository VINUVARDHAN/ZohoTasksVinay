package com.learn.java.chapter9;
public class Important {
	public static void main(String args[])
	{
		CC3 c = new CC3();
		CC2 b = (CC2) c;
		CC1 a = (CC1) b;
		
		I2 i = (I2) a;
		i.m2();
	    //I3 j = (I2) c;
        I2 j = (I3) c;
		I1 k =  b;
	
	}
}

interface I1{
	void m1();
}
interface I2 extends I1{
	void m2();
}
interface I3 extends I2{
	void m3();
}
class CC1{
	
}
class CC2 extends CC1 implements I1{
	public void m1()
	{
		System.out.println("method 1 in CC2");
	}
}
class CC3 extends CC2 implements I2,I3{
	public void m2()
	{
		System.out.println("method 2 in CC3");
	}
	public void m3()
	{
		System.out.println("method 3 in CC3");
	}
}