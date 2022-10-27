package com.learn.java.C10_ExceptionHandling;

//All classes under the throwable class will be exceptions

public class UserDefinedException {
    public static void main(String args[]) {
        UserDefException c = new UserDefException();
        try {
            throw c;
        } catch (UserDefException e) {
            System.out.println(e);
        }
    }
}

//It should be child class of Throwable 
class UserDefException extends Throwable {

}