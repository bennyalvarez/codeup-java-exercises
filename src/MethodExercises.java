import java.util.Scanner;

public class MethodExercises {

    //#1 Basic Arithmetic

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //bonus

    public static int multiply1(int x, int y) {
        int res = 0;
        while(x > 0){
            res += y;
            x--;
        }
        return res;
    }

    public static int multiply2(int x, int y) {
        int res = 0;
        for(int i = 0; i < x; i++){
            res += y;
        }
        return res;
    }

    //recursion
    public static int multiply4( int x, int y){
        if(x == 0)
            return 0;
        return multiply(x - 1, y) + y;
    }

    public static int getInteger(int min, int max) {
    System.out.print("Enter a number between 1 and 10: ");
    Scanner scanner = new Scanner(System.in);
    int userInput = 0;
    do {
        userInput = scanner.nextInt();
        if(userInput){

        }
        System.out.println("great");
    }
    while (userInput > max || userInput < min);
    return userInput;
    }




    public static long getFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        long num = scanner.nextInt();
        long result = 1;
        System.out.printf("%d! = ", num);
        for(int factor =1; factor <= num; factor++){
            result *= factor;
            System.out.printf("%d ", factor);

        }
        return(result);
    }




    public static void main(String[] args) {
        System.out.println(subtract(5,2));
        System.out.println(multiply(5,2));
        System.out.println(divide(6,2));
        System.out.println(add(5,2));
        System.out.println(modulus(5,2));
        System.out.println(multiply1(5,11));
        System.out.println(multiply2(5,11));
        System.out.println(multiply4(5,11));

    }
}

//
//verb
//        represent as or by an instance.
//        "a study of two groups who seemed to instantiate productive aspects of this"