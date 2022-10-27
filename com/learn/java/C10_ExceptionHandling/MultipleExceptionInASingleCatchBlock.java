package com.learn.java.C10_ExceptionHandling;

import java.sql.SQLException;

public class MultipleExceptionInASingleCatchBlock {
	 public static void main(String args[])
	 {
	     try {
	         // code
	       } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { 
	         // catch block
	       }
	 }
}