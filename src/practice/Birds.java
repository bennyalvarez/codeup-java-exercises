package practice;

//A class has variables and methods.
//        You make an object from a class, to use its variables and methods:
//
//        Shirt s = new Shirt();
//        "s" is the Shirt object made from the Shirt class.

public class Birds {

    String color = "blue"; //properties are like variable
    String size = "small"; //properties....

    static void eat() {  //methods are like functions, what it can do.
        System.out.println("Bird is eating");
    }         //this is a method.

    static void sing() {
        System.out.println("Bird is singing."); // methods - things it can do.

        }
    Birds() {  //this code will replace what's in the constructor
        System.out.println("Bird is created");
    }
}
