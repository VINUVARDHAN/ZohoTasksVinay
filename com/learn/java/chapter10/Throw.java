package com.learn.java.chapter10;

class Throw extends Throwable {
    public static void main(String args[]) {
        Throw a = new Throw();
        try {
            // handling an explicitly declared exception with object of a exception class
            throw a;

        } catch (Throw e) {
            System.out.println(e);
        }

        System.out.println("---------------------");

        // manually declaring an exception with message
        if (10 > 9)

        {
            throw new ArithmeticException("Error message for buil in exception");

        }
        
        System.out.println("End of exceution");
        
        
        // In below line we can't pass the arguments because it does not contain any
        // constructor

        // throw new Throw("Error message for user defined in exception");
    }
}
//We can't handle checked exception because they cause compile time error
//That can be handled by the throws keyword in method signature


/**
 * Below statements of throw keyword does not execute
 */
