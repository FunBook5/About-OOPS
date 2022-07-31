package com.tyagi.oops2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    // WHAT IS A PACKAGE?

    //We have created a package for us this time, packages are just containers for classes.
    // com.tyagi.intro can be understood as intro folder inside tyagi folder inside com folder.

    // Having the file with same name in same project is possible using different packages.

    //IMPORT STATEMENT in packages

    // If files are in same folder import statement not req.

    // Can be used to import a method from a file from another package and use in this current file.
    // example :- import static package com.tyagi.greeting.method_name

    // Even ArrayList is imported here using java.util.Arraylist in header.
        ArrayList list1 = new ArrayList<>();





    // WHAT IS STATIC?

    // Variables which are common to all obj of the class and do not depend on any obj.
    //example :- Name variable depends on an obj of human class but population variable doesn't.

    class Human {
        String Name;
        static long population = 0;  //Implementation for a variable


        public Human(String Name) {    //Inside constructor, for static variables "this" is not used class name is used.
            this.Name = Name;
            Human.population += 1;
        }
    }

    // Static variables can even be used if no objects are created.
        //For initialising static variables we can use static blocks. - like constructor for static.
        // But static block is only run once when class is loaded the first time.

    //   NOTE: Why is static there is public static void main(String[] args)
    //    It is there because main is the first thing to be run, and hence should/can not be called after some obj is called.

    // this keyword cannot be used inside static methods.



    //WHAT ARE INNER CLASSES?
        // Classes inside classes
        // static inside a non-static class works, the opposite doesn't.




    // HOW DOES SYSTEM.OUT.PRINTLN WORK?
        // System is a class, out is a object variable of that printStream class inside System class and println is a method in System class.





    // WHAT IS A SINGLETON CLASS?
      //When we want only one instance of a class to be created and then the class can not be used we use.We use static for this purpose.
      //Please see the code online.
        System.out.println("Done for the 2nd day!");
    }
}