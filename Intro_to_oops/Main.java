//My notes from watching Kunal Khuswaha's OOPS playlist


// Important Note : Java is not a strict/pure oops language as primitives are not objects in java.
//                  Though they can be used as objects using wrapper classes.

class Student{
            String name;
            int roll_no;
            String section;
            float marks;

    public Student(String name, int i, String q, float v) {
        name = "No_Name_given";
        i = 0;
        q = "Not_given";
        v = 0.0f;
    }

    public Student(){
        this.name = "no_name";
        this.roll_no = 22;
        this.section = "no_section";
        this.marks = 94.2f;
    }

    public void greeting(){
        System.out.println("Hello!!!");
    }
}

public class Main {
    public static void main(String[] args) {

        // WHAT IS A CLASS?


        // if we want just a data structure of 5 integers

        int[] numbers = new int[5];

        for(int i=0;i<5;i++){
            numbers[i] = i;
        }


        // but if we want a data structure that includes name, age ,section, etc
        // there we have to make a class - named group of properties and functions

        // class can also be defined as a way to define your own datatype


        //IMPLEMENTATION OF CLASS


        //        public Class Student{
        //            int name;
        //            int roll_no;
        //            String section;
        //        }

        // Class is a template of an object, and an object is an instance of a class
        // INSTANCE MEANS PHYSICAL IMPLEMENTATION

        // Therefore an example can be a class is a blueprint and object is the building

        //Objects have three things - state, identity and behaviour
        //Objects are stored in heap and reference variables in stack




        // CREATING OBJECTS

        Student Abhinav; // Declaration of object(static), memory is not yet allocated therefore not pointing to null.
        Abhinav = new Student();// this is where memory allocated (dynamically) and initialisation occurs.

        // Here Student() is the constructor.

        //WHAT IS DYNAMICALLY? - Means allocates memory at runtime.

        // We access instance variables using reference variables and dot operator.

        //example
        Abhinav.roll_no = 12; // Note :- By default primitives point to zero if not initialised.
                                         //Wrapper classes point to null.

        Abhinav.marks = 94.2f; //f is required in the end else reads it as double.

        //Note:- As Java is static language you can't say 'Abhinav.salary' if it doesn't exist as instannce variable, you can do
        //       this in Python as it is a dynamic language.


        // CONSTRUCTORS

        // Implementation given above in class.
        // Default constructor is provided if constructor not given.


        Student Parth = new Student("Parth",5,"Q",88.5f);
        // Here Student() is the constructor.

        // This keyword in Constructors
        // in Abhinav we did not pass any values like we did in Parth, so how were values assigned

        // this.name means 'this' is replaced by 'Abhinav' and the values provided in constructor are taken by that
        // variable.


        // Constructor Overloading - Passing different parameters and keeping the name of constructor same.
                                    // See implementation of Parth and Abhinav.



        //CONSTRUCTOR CAN ALSO CALL ANOTHER CONSTRUCTOR

        //Syntax:
//        public Student(String name){
//            this(name,1,"NO-section",88.5f);
//        }

        // So when you will pass Student Aryan = new Student("Aryan");
        // the constructor calls the four parameter constructor.

        // 'this' changes to 'Student'





        // ADDING A FUNCTION TO A CLASS

//        public void greeting(){
//            System.out.println("Hello!!!");
//        }

          Abhinav.greeting();

          // You can pass parameters to the function too.


        // FINAL KEYWORD
        // makes the variable or method resistant to modification.

        //eg: final int a = 2;



        System.out.println("Done for today");
    }
}