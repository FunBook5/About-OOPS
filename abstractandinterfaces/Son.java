package com.tyagi.abstractandinterfaces;

public class Son extends Parent {

    @Override
     public void Career(String name){
         System.out.println(name);
     }

     @Override
    public void Partner(){
        System.out.println("Partner");
    }

}
