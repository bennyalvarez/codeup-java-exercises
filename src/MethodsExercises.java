import java.util.Scanner;

public class MethodsExercises {

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

    //recursion of multiply
    public static int multiply4( int x, int y){
        if(x == 0)
            return 0;
        return multiply(x - 1, y) + y;
    }


    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a number between %d and %d%n", min, max);
        int userInput = 0;
        do {
            userInput = sc.nextInt();
            if (userInput <= max && userInput >= min) {
                System.out.println("Thank you!");

            } else {
                System.out.printf("Please enter a number between %d and %d%n", min, max);
            }
        }while(userInput > max || userInput < min);

        return userInput;
    }






//    public static long getFactorial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 10");
//        long num = scanner.nextInt();
//        long result = 1;
//        System.out.printf("%d! = ", num);
//        for(int factor =1; factor <= num; factor++){
//            result *= factor;
//            System.out.printf("%d ", factor);
//
//        }
//        return result;
//    }


    public static long getFactorial(){
        long result = 1;
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 - 10 | (-1 to exit)");
            num1 = sc.nextInt();
            if (num1 <= 10 && num1 >= 1) {
                System.out.printf("%d! = ", num1);
                for (int i = 1; i <= num1; i++) {
                    System.out.printf(" %d ", i);
                    result = result * i;
                    if (i < num1) {
                        System.out.print(" x ");
                    } else {
                        System.out.printf(" = %d%n", result);
                        result = 1;
                    }
                }
            }else if(num1 == -1){
                System.out.println("Thank you, come again!");
            }
            else {
                System.out.println("That number is not between 1-10... try again..%n");
            }
        }while(num1 != -1);

        return result;
    }

//    public static void rollDice(){
//        boolean dice = false;
//        do{
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose how many sides for your dice.");
//            int sides = scanner.nextInt();
//            for (int i = 0; i < 2; i++) {
//                System.out.println((int) Math.floor(Math.random() * (sides) + 1));
//            }
//            System.out.println("Would you like to roll again?(Yes / No)");
//            String userInput = scanner.next().toLowerCase(Locale.ROOT);
//            if(userInput.equals("yes")){
//                dice = true;
//            }else{
//                break;
//            }
//        }while(dice);
//    }



    //this is like console.log to test each method.
    public static void main(String[] args) {
        System.out.println(subtract(5,2));
        System.out.println(multiply(5,2));
        System.out.println(divide(6,2));
        System.out.println(add(5,2));
        System.out.println(modulus(5,2));
        System.out.println(multiply1(5,11));
        System.out.println(multiply2(5,11));
        System.out.println(multiply4(5,11));

        getInteger(1, 10);
        System.out.println(getFactorial());

    }
}

//
//verb
//        represent as or by an instance.
//        "a study of two groups who seemed to instantiate productive aspects of this"