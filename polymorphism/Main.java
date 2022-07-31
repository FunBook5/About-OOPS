package com.tyagi.polymorphism;

// POLYMORPHISM

// Poly - many and morphism - ways to represent

// Generally occurs during inheritance.

public class Main{
    public static void main(String[] args){

        // There are two types of polymorphism -- Static(compile time) and Dynamic(Run time)

       // Static is achieved via method overloading.
       // NOTE : Can also be achieved by operator overloading but that is not allowed in java.

        //METHOD OVERLOADING - Same name but different return type (or) parameters (or) order of parameters.

      //  Base A = new Base();
      //  Base A = new Base("Parth");

        // Compile time is achieved by overriding.

        // METHOD OVERRIDING - Declaring everything in a function that is same in an already defined function
        // which is usually a parent function.

        // We cannot override static methods.

        // Look into what is upcasting.

        // Example given at last in form of Shape and Circle.


    }


}

class Shapes{
    void Shapes(){
        System.out.println("This is Shapes");
    }

}

class Circle extends Shapes{
    // In child class
    @Override // annotation
    void Shapes(){
        System.out.println("This is Circle");
    }
             }