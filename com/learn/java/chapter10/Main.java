package com.learn.java.chapter10;

class Main
{
    public static void main(String[] args)
    {
        try
        {
            throw new Exception();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            System.out.println( "Finally" );
        }
    }
}