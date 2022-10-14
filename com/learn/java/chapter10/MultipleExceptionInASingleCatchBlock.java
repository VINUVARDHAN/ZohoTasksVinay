package com.learn.java.chapter10;

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