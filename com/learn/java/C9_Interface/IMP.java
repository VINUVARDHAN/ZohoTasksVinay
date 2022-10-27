package com.learn.java.C9_Interface;

class IMP implements i111,i222,i333{
    public static void main(String[] args) {
        i111 i1 = new IMP();
        i222 i2 = new IMP();
        i333 i3 = new IMP();
        i3 = (i333)i2;
    }
}



interface i111{
    
}
interface i222 extends i111{
    
}
interface i333 extends i222{
    
}