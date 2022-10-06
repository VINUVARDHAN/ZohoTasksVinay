package com.learn.java.chapter7.StaticImport.StaticMemberClass;
import static com.learn.java.chapter7.StaticImport.StaticImportProgram.ImportingFIles.*;

import static com.learn.java.chapter7.StaticImport.StaticImportProgram.ImportingFiles2.*;
public class Import {
	static void methodImport()
	{
		System.out.println("method import");
	}
	public static void main(String args[])
	{
		methodImport();
		
		//it result in ambiguity error
		//method1();
		//static import can't import non static methods
		//method2();
	}
}