package com.tyagi.inheritance;

public class Main {

    public static void main(String[] args){

        //Properties of OOPS
        // Main properties are inheritance, polymorphism, abstraction and encapsulation


        //INHERITANCE

        // A parent(or)base class gets inherited by a derived(or)child class.
        // Implemented using extends keyword.

        // child can access parent variables but other way around is not possible.
        // Below weight cannot be used by Base class.

      //NOTE: Child e = new Base(); -- is not a valid statement.

      //  NOTE: Base d = new Child(); -- It is type of reference variable(/declaration) not type of constructor which will determine
        //                               what variables can be accessed.
        //Example
        // d.weight - cannot be accessed in below example.

        class Base{
            String name;
            Integer age;

            public Base(){
                this.name = name;
                this.age = age;
            }

            public Base(String name){
                this.name = name;
            }

            public Base(Base old){
                this.name = old.name;
                this.age = old.age;
            }
        }

        class Child extends Base {
            Integer weight;

            Child(String name){
                super(name);  //Call the constructor in parent having parameter name;
                this.weight = -1;
            }
        }
            Child a = new Child("Abhinav"); // When you call a class like this, you have to initialise parent class variable also.
            Base b = new Base(a);

        System.out.println(a.name);

        a.name = "Parth";
        Base c = new Base(a);

        System.out.println(b.name);
        System.out.println(c.name);



        //TYPES OF INHERITANCE
        // Single Inheritance
        // Multilevel Inheritance
        // Multiple Inheritance -- not allowed in java -- C inheriting from A and B.

//        NOTE: There might be use cases where child is req to inherit from multiple parents, so how is that done then?
//                Using INTERFACES.

        // Hierarchical Inheritance
        // Hybrid Inheritance


        // SUPER KEYWORD
        // Used to call the required constructor in the parent class.
        // Should be the first thing written while writing constructor in child.

        // Super means directly above it, useful to remember in case of (A->B->C) multilevel inheritance.
        // NOTE: If super keyword is used in parent base class it will point to object class.

        // Let me demonstrate using the above example itself.(On line 39)

        //super.weight;  --  if child and Base class have same variable and you want to access variable value in parent.


        // PRIVATE, PUBLIC AND PROTECTED
        // A private thing can only be used in the file it is initialised.
        // Protected can be used in child classes too.
        // Public can be used anywhere.








    }

}
