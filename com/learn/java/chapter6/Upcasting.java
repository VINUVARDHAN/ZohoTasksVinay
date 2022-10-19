package com.learn.java.chapter6;

class AA{
    
}
class BB extends AA{
    
}
class CC extends BB{
    
}
class Upcasting{
    void m()
    {
       //up casting explicitly is possible for classes
        BB b1 = new CC();
        BB b2 = new BB();
        CC c1 = (CC)b1;
        CC c2 = (CC)b2;
    }
}