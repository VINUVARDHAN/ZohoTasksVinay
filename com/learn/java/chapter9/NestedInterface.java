package com.learn.java.chapter9;

//interface inside the class
//interface can be public private protected if nested
class OuterClass {
	 static interface StaticInnerInterface1{
		
	}
     interface InnerInterface1{
		
	}
}
//interface inside the another interface
//interface by default will be public and abstract
interface OuterInterface{
	 static interface StaticInnerInterface2{
		
	}
     interface InnerInterface2{
		
	}
}

//This is how to implement the nested interface
public class NestedInterface implements OuterClass.StaticInnerInterface1,OuterInterface.StaticInnerInterface2{
	public static void main(String args[])
	{}
} 