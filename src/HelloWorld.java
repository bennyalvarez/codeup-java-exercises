import com.sun.jdi.PathSearchingVirtualMachine;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(", World!");

        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);


        //9
//        float myNumber = 3.14F;       //1st way: throwing "F" at the end of number will fix.
//        float myNumber = (float) 3.14; //2nd way
//        System.out.println(myNumber);
//
//        //12
//        String theNumberThree = "three";
//        Object o = theNumberThree; //This throws an issue
//        System.out.println(o);
//        int three = (int) o;



    }
}

