package com.learn.java.C10_ExceptionHandling;

public class NestedExceptionHandling {
	public static void main(String args[]) {
		try {
			try {
				try {
					int f[] = new int[5];
					f[30] = 1234;
				} catch (NumberFormatException e) {
					System.out.println(e + "    inner");
				}
			} catch (NullPointerException e) {
				System.out.println(e + "    middle");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "    outer");
		}
	}
}

/**
 * 
 * When inner catch cannot handle the exception it will use outer catch. In the
 * example exception present inside the inner try but handled by outer catch
 * 
 * 
 * ******* NOTE ******* Order is not necessary for nested exception handling
 */