package com.learn.java.chapter9;
//Disadvantage of not using the interface

/**

//parent or base class  
class A 
{  

//a parameterized constructor  
A(int x, int y)  
{  
   
}  

void foo()  
{  
System.out.println("Inside the foo method of base class.");    
}  
}  

//child or derived class  
class BClass extends A  
{  
void foo()  
{  
System.out.println("Inside the foo method of derived class.");    
}  
}  

public class TightlyCoupled  
{  

//main method   
public static void main(String argvs[])   
{  
//creating an object of class B  
BClass obj = new BClass();  
obj.foo();  
}  
}  
*/