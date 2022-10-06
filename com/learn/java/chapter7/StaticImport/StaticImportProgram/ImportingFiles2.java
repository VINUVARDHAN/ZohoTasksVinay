package com.learn.java.chapter7.StaticImport.StaticImportProgram;

public class ImportingFiles2 {
		public static void method1()
		{
			System.out.println("Static method of class ImportingFiles ");
		}
		public void method2()
		{
			System.out.println("Non Static method of class ImportingFiles ");
		}
		class InnerNonStatic{

		}
		static class InnerStatic{

		}
		public static void methodImport()
		{
			System.out.println("method inside Importing files");
		}
		static class NestedClass{
			static void method()
			{
				System.out.println("method in nested class");
			}
		}
}
