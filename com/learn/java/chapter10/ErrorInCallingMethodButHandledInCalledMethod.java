package com.learn.java.chapter10;

import java.io.*;

class M {
	void method() throws IOException {
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
		fileInputStream = new FileInputStream(file);
		fileInputStream.read();
		
	}
}

class ErrorInCallingMethodButHandledInCalledMethod {
	public static void main(String args[]) throws IOException {// declare exception
		M m = new M();
		// In this we are handling the exception in the called method but the
		// error will be pop up at calling line
		m.method();

		System.out.println("Normal flow...");
	}
}
/**
 * ****** NOTE ********
 * 
 * Consider there is no line 7,8,9 it won't show any error because we 
 * through exception at main method 
 * So,it will terminate at starting point only
 */