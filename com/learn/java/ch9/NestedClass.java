package com.learn.java.ch9;

public class NestedClass {
    public static void main(String[] args) {
        String message = "the nested class is done properly";
        Nested nas = new Nested(message);
        nas.printingMessage();
    }
    static class Nested
    {
        String message;
        Nested(String message)
        {
            this.message = message;
        }
        void printingMessage()
        {
            System.out.println(this.message);
        }
    }
}
