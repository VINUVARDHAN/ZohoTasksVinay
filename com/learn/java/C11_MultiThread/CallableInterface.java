//$Id$
package com.learn.java.C11_MultiThread;

//A Java program that illustrates Callable  
//to generate and return a random number between 0 - 9  

//import statements  
import java.util.concurrent.Callable;  
import java.util.Random;  

//importing the concrete class FutureTask  
import java.util.concurrent.FutureTask;  

class JavaCallable implements Callable  
{  
@Override  
public Integer call() throws Exception  
{  
Random randObj = new Random();  
Integer randNo = randObj.nextInt(10);  
Thread.sleep(randNo * 1000);  
return randNo;  
}  
}  

public class CallableInterface  
{  
// main method  
public static void main(String argvs[]) throws Exception  
{  
 
 // FutureTask is the concrete class  
 // creating an array of 5 objects of the FutureTask class  
 FutureTask[] randomNoTasks = new FutureTask[10];  
 
 // loop for spawning 10 threads  
 for (int j = 0; j < 10; j++)  
 {  
   // Creating a new object of the JavaCallable class  
   Callable clble = new JavaCallable();  
 
   // Creating the FutureTask with Callable  
   randomNoTasks[j] = new FutureTask(clble);  
 
   // Since FutureTask implements Runnable,   
   // one can create a Thread  
   // with a FutureTask object  
   Thread th = new Thread(randomNoTasks[j]);  
   th.start();  
 }  
 
 // loop for receiving the random numbers  
 for (int j = 0; j < 10; j++)  
 {  

   // invoking the get() method  
   Object o = randomNoTasks[j].get();  
     
   // The get method holds the control until the result is received  
   // The get method may throw the checked exceptions  
   // like when the method is interrupted. Because of this reason  
   // we have to add the throws clause to the main method  
     
    // printing the generated random number  
   System.out.println("The random number is: " + o);  

 }  
}  
}  
