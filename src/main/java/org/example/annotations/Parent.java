package org.example.annotations;


public abstract class Parent {
    public  void someMethod(){

    }

    @Deprecated
    public void otherMethod(){
        System.out.println("Doing old stuff...");
    }
}
