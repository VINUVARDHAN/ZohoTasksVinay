package com.learn.java.C10_ExceptionHandling;

public class ExecutionTillException {
    public static void main(String args[]) {
        try {
            final int a = 50 / 0;
            
            System.out.println("Statement not executed"+a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("last statement");
        }
    }
}
//Rest of the statements won't execute once exception is triggered