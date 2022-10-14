package com.learn.java.chapter10;

public class ExceptionWithInCatch {
	public static void main(String[] args) {
		try {
			int a = 50 / 0;
		} catch (ArithmeticException e) {
			try {
				int b = 50 / 0;
			} catch (ArithmeticException f) {
				System.out.println(e);
			}
		}
		finally {
		    System.out.println("last statement");
		}
	}
}
//catch itself may contain exception so try can be used in catch and nested try can also be used

//Even if the exception is not handled in catch means it will show Compile time error