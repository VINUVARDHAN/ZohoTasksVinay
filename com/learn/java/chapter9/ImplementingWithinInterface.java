package com.learn.java.chapter9;


class ImplementingWithinInterface implements Interface4{
	/**
	 * In this class we are not declared m3 method
	 * Because it is already implemented in Interface4
	*/
	public static void main(String args[])
	{
		Interface4 i = new ImplementingWithinInterface();
		i.m3();
	}
	@Override
	public void m2() {
		
	}
	@Override
	public void m4() {
		
	}
}

interface Interface2{
	void m2() ;
}

interface Interface3{
	 void m3() ;
}
//interface can extend more than one interface
interface Interface4 extends Interface2,Interface3{
	void m4();

	/**
	 *  No need to implement the method which are having body already
	 *  But still it can be override
	 */
	default void m3()
	{
		System.out.println("Method 3 in Interface ");
	}
}