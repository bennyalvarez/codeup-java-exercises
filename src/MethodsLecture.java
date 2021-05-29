import java.util.Scanner;

public class MethodsLecture {
    //souf prints printf instead of sout.
    //insantiate that you do your methods out of public static void main, which is kinda
    //like console.log, good for logging to command line what something is doing.

    public static void sayHello() {
        System.out.println("Sorry i'm in a bit of a rush. Have a great day");
    }
    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day!", name);
    }

    public static void sayHello(String salutation, String name) {
        System.out.printf("%s there! My name is %s! Have a great day!%n", salutation, name);
        //you can use methods with the exact same name but different outcomes.
    }
    //method overloading. define methods with exact same name but different method calls.
    public static void sayHello(int times) {
        for(int i = 0; i <= times; i++) {
            System.out.println("Hello, darling!");
        }
    }



    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void bottlesOfBlank(String beverage, int numBottles) {
        if(numBottles == 0) {
            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around%nAll bottles of %s on the wall%n",beverage, beverage, beverage);
        } else if (numBottles == 1) {  //use souf
            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it around%n, No more bottles of %s on the wall%n", beverage, beverage, beverage);
        } else if (numBottles == 2) {
            System.out.printf("2 bottle of %s on the wall%n2 bottle of %s%nTake it down, pass it around%n,%n1 bottles of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles -1);
        } else {
            System.out.printf("%d bottle of %s on the wall%n%d bottle of %s%nTake 1 down, pass it around%n, bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles -1, beverage);
        }
    }

    public static void willYouTakeUsToMtSplashmore(Scanner sc) {
        //it's like practicing your instrument
        //!sc = not this entire operation
        System.out.println("Will you take us to Mt. Splashmore?");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            willYouTakeUsToMtSplashmore(sc);
        } else {
            System.out.println("Thanks Dad, you're the best!");
        }
    }


    public static void main(String[] args) {
        //methods are public, static is another modifier meaning 'is this method off of
        //a specific object of another class or this class? ex. when you introduce yourself
        //to somebody, it's different from another person introduces themselves. that is dynamic.
        //static is universal. for now, we will use static, as a whole not invividual.
        //void is unique. it is devoid of a return. void methods will not return any info to us
        //main is the name of our method.
        //methods in java are about the same as functions in javascript. but a few differences.
        //sayHello and multiply method is wrote out differently because of the responses. public static int.
        sayHello();
        sayHello("Benny");
        sayHello("Howdy","Benny");
        sayHello(4);
        System.out.println(multiply(5,2));
        int product = multiply(7, 3);
        System.out.printf("Did you know that %d X %d = 's %d", product, product, product * product);
        willYouTakeUsToMtSplashmore(new Scanner(System.in));
    }
}
//recurssion repeats itself over and over
