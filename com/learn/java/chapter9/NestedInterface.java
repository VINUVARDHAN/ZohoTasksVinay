package com.learn.java.chapter9;

//interface inside the class
//interface can be public private protected
class OuterClass {
	 static interface StaticInnerInterface1{
		
	}
     interface InnerInterface1{
		
	}
}
//interface inside the another interface
//interface by default will be public
interface OuterInterface{
	 static interface StaticInnerInterface2{
		
	}
     interface InnerInterface2{
		
	}
}