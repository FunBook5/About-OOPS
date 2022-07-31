package com.tyagi.abstractandinterfaces;

public class Main {

    public static void main(String[] args){

        // Abstract Classes

        // Abstraction in classes is creating a parent class which tell us what to do not how to do it.

        // So we know that abstract method means that we have
        // to create a function but what will be inside the function is our choice.

        //NOTE: A class having abstract method must also be declared as abstract.

        // The child class must override the abstract function defined in parent class.


        Son a = new Son();
        Parent b = new Son();

       a.Career("IT");
       b.Career("it");

       // But objects can't be created for an abstract class.
       // example:
       //Parent c = new Parent(); -- will give error, because then if you call methods they will not execute.

        // So any methods you define in Parent class can only be called using Son obj.
        // static methods can be created and called directly.


        // NOTE: We know final keyword stops that class from being inherited so you obs can't have a final abstract class.





        // INTERFACES

        // A class which only has two things:-
        //1)Abstract methods.
        //2)final static variables.

        // IS NOT A CLASS ANYMORE IT IS CALLED INTERFACE.

        //Implementation
        interface engine{

             int PRICE = 1200000; //static and final by default.

             void start();
             void stop();
        }

        interface brake{

            void brake1();
        }

        class Car implements brake,engine{

            @Override
            public void start() {
                System.out.println("start");
            }

            @Override
            public void brake1() {
                System.out.println("brake");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }
        }



        // Inheritance is implemented using 'extends' keyword, an interface is implemented using 'implements' keyword.
       // This is how java counters the multiple inheritance problem,
        //i.e. it implements keyword can be used to implement multiple interfaces by a class.


        Car myCar = new Car();

        myCar.stop();


        //Note: interfaces creation does have a overhead because of overrides,
        // hence should not be used in performance critical environments.

       // Interfaces can also extend interfaces.

      //  RARE FACT:
        // Starting from Java8 it is possible to give a default implementation to methods in
        // interface hence making overriding not necessary. This is done using 'default' keyword.

    }
}
