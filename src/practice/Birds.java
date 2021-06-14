package practice;

//A class has variables and methods.
//        You make an object from a class, to use its variables and methods:
//
//        Shirt s = new Shirt();
//        "s" is the Shirt object made from the Shirt class.

public class Birds {

    String color = "blue"; //properties are like variable
    String size = "small";

    static void eat() {  //methods are like functions, what it can do.
        System.out.println("Bird is eating");
    }

    static void sing() {
        System.out.println("Bird is singing.");
    }
}
