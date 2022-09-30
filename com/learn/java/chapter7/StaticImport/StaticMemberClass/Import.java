package com.learn.java.chapter7.StaticImport.StaticMemberClass;
import static com.learn.java.chapter7.StaticImport.StaticImportProgram.ImportingFIles.*;
import static com.learn.java.chapter7.StaticImport.StaticImportProgram.ImportingFiles2.*;
//import static com.learn.java.chapter7.StaticImport.StaticImportProgram.ImportingFiles2.*;
public class Import {
	public static void main(String args[])
	{
		//it result in ambiguity error
		//method1();
		//static import can't import non static methods
		//method2();
	}
	void method1()
	{
		method1();
	}
}