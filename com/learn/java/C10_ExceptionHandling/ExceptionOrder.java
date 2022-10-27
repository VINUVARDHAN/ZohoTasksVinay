package com.learn.java.C10_ExceptionHandling;

public class ExceptionOrder {
	public static void main(String args[]) {
		try {
			int a = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} catch (Throwable e) {
			System.out.println(e);
		}
	}
}

//Order of catch should be bottom to top not vs