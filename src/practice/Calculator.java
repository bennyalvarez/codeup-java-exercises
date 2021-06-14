package practice;

public class Calculator {       //this is a class.
    static boolean isEven(int a) {
        int remainder = a % 2;
        if(remainder == 0) {
            return true;
        } else {
            return false;
        }
    }
}
