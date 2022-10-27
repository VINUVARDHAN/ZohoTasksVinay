package com.learn.java.C10_ExceptionHandling;

public class RunTimeOrUncheckedException {
	public static void main(String args[]) {
		// Multiple try block possible within the method
		// different type of runtime Exception
		System.out.println("Runtime exceptions");
		try {
			int a = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int b;
			String c = null;
			b = c.length();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		try {
			String d = "vav";
			int e = Integer.parseInt(d);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		try {
			int f[] = new int[5];
			f[30] = 1234;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		// **** NOTE ****
		/**
		 * We can also replace the exception with parent class exception example for
		 * arithmetic ,null, number formula and array all these are child of exception
		 * class Runtime Exception you can replace with that
		 * 
		 * catch(RuntimeException e){}
		 */
		System.out.println("------------------------------------------------");

		// you cannot have the same catch for multiple try blocks

		/**
		 * try {} try {} catch(ArithmeticException e) { }
		 */

		// you must have at least one catch or finally block after try block or both
		try {
			int d = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block");
		}
	}
}