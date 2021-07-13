package practice;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

class Vehicle {  //super class

    String brand = "mazda";

    public void honk() {
        System.out.println("Honk!");
    }
}

class Car extends Vehicle {   //subclass

    String Engine = "1.8L";
}

class Dog {
    void bark() {
        System.out.println("bark!");
    }
}

class Chihuahua extends Dog {
    void bark() {
        System.out.println("yip yip!");
    }
}

//example of Inner classes...
class Outside {
    int a = 7;

    class Inside {
        int b = 4;
    }
}
//abstract class Tiger {   //you make abstract class when you want to reuse methods over and over. but you can't make an object from abstract class.
//    void stalk() {
//        System.out.println("Stalking...");
//    }
//    abstract void run(); //no curly brace because no code.
//}
//
//class BabyTiger extends Tiger {
//    public void run() {
//        System.out.println("Runnin!");
//    }
//}

interface Tiger {
    public void stalk();
    public void run();
}

class BabyTiger implements Tiger {
    public void stalk() {
        System.out.println("stalking");
    }
    public void run() {
        System.out.println("running!");
    }
}

enum Difficulty { //Enum is a group on constants...a variable that doesn't change. This ex, we are doing a list.
    LOW,
    MEDIUM,
    HIGH,
    EXTREME
}

public class LearnJava {


    //
//    static int a = 5;
//
//    String name;
//    int age;
//
//    //sample of method overloading
//    void add(int first, int second) {
//        System.out.println("The addition of two numbers is " + (first + second));
//    }
//
//    void add(double first, double second) {
//        System.out.println("The additon of two numbers is " + (first + second));
//    }
//
    public static void main(String[] args) {

        Bear smokey = new Bear();
        smokey.growl();
        smokey.eat();
        smokey.scratch();
        System.out.println("Smokey's eye color is " + smokey.EYE_COLOR);


        Gun glock = new Gun();
        glock.reload();
        System.out.println(glock.caliber);
        System.out.println(glock.caliber = ".45mm");

//        File f = new File("/Users/benjaminalvarez/ourFile.txt");

        try {
            FileWriter fw = new FileWriter("/Users/benjaminalvarez/Desktop/ourFile.txt");
//            f.createNewFile();
            fw.write("this is from alex's course!");
            fw.close();
            System.out.println("Successfully wrote!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList a = null;

        try {
            System.out.println(a.isEmpty());
        } catch(Exception e) {
            System.out.println(e);
        }

        Integer.parseInt("3");
        System.out.println(Integer.parseInt("3")+ Integer.parseInt("2"));


        //data structure easier to use than a regular array.
        ArrayList<Integer> al = new ArrayList();  //we have to say what type it is in < >
        al.add(3);
        al.add(7);
        al.add(94);

        System.out.println(al.contains(7));

        Stack<Integer> s1 = new Stack<Integer>();
        s1.add(4);
        s1.add(7);
        s1.add(1);

        System.out.println(s1);

        System.out.println(s1.pop()); //removes 1
        System.out.println(s1.pop()); //removes 7
        System.out.println(s1.pop()); //removes 4

        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("Alex", 23);
        h.put("Michael", 22);
        h.put("Jose", 19);

        System.out.println(h.get("Michael"));


        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalTime z = LocalTime.now();
        System.out.println(z);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");


        int age = scan.nextInt();

        System.out.println("Enter your ice cream flavor");

        String flavor = scan.next();
        System.out.println(age + " " + flavor);

        Difficulty d = Difficulty.EXTREME;
        System.out.println(d);

        //ex. looping through enum.
        for(Difficulty e: Difficulty.values()) {
            System.out.println(e);
        }

        BabyTiger bt = new BabyTiger();
        bt.run();
    }
}


//        Chihuahua tC = new Chihuahua();
//        tC.bark();
//
//        Dog shaggy = new Dog();
//        shaggy.bark();
//
//
//        Car c = new Car();
//
//        c.honk();
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//
//        String name = scan.nextLine();
//        System.out.println(name);
//
//
////        Birds robin = new Birds();
////
////        robin.eat();
////        System.out.println(robin.size);
//
//        Calculator calc = new Calculator();
//        System.out.println(calc.isEven(105));
//
////        Birds bigBird = new Birds();
////        System.out.println("Big Bird's color is not " + bigBird.color);
////        System.out.println("Big Bird is not " + bigBird.size + "\n");
////        bigBird.sing();
//
//        Ukulele lanikai = new Ukulele();
//        System.out.println("The price of a new Lanikai ukulele is " + lanikai.price + "\n");
//
//        Shirt polo = new Shirt();
//        System.out.println("The color of this polo is " + polo.color + "\n");
//
//        MiniBus bennyVan = new MiniBus();
//        System.out.println("The seating capactiy is " + bennyVan.capacity);
//        System.out.println("The color of this van is " + bennyVan.color);
//
//        System.out.println("Wanna hear something cool?");
//        bennyVan.honk();
//        System.out.println("Wanna see something cool?");
//        bennyVan.slideDoor();
//
//
//        System.out.println("The cost of this Mini Bus is $" + bennyVan.cost + ".00.");
//        System.out.println("Can it be upgraded to electric? The answer is " + bennyVan.electricUpgrade);
//
//
//
//
//
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a number here:");
//        String userInput2;
//        userInput2 = in.nextLine();
//        System.out.println(userInput2);
//
//
//
//
//
//        //method overloading add
//        LearnJava addObj = new LearnJava();
//        addObj.add(5,10);
//        addObj.add(5.256, 7);
//
//
//        //tenary operator
//        int greaterNumber;
//        greaterNumber = (500 > 400) ? 500 : 400;
//        System.out.println(greaterNumber);
//
//        int yourFavenumber;
//        yourFavenumber = (21 > 20) ? 21 : 20;
//        System.out.printf("%d \n", yourFavenumber);
//
//        if (5 % 2 == 0) {
//            System.out.println("Number is Even");
//        } else {
//            System.out.println("Number is Odd");
//        }
//
//        int studentPercentage = 76;
//        if (studentPercentage < 35) {
//            System.out.println("Fail");
//        } else if (studentPercentage <= 50) {
//            System.out.println("You need to concentrate more on your studies.");
//        } else if (studentPercentage <= 75) {
//            System.out.println("Good");
//        } else {
//            System.out.println("Excellent!");
//        }
//
//        //Arrays
//
//
//        int[] firstArray = new int[3];
//        firstArray[0] = 1;
//        firstArray[1] = 2;
//        firstArray[2] = 3;
//
//        int[] secondArray = new int[]{10, 20, 30};
//
//        int[] thirdArray = {100, 200, 300};
////        for(int i=0; i<thirdArray.length; i++){
////            System.out.println(thirdArray[i]);
////        }
//        //alt way instead of for loop...easier and cleaner.
//        for(int i: thirdArray){
//            System.out.println(i);
//        }
//
//        //for each or enhanced for loop - use because it's cleaner.
//        int[] number = {0,1,2,3,4,5};
//
//        for(int i:number){
//            System.out.println(i);
//        }
//
//        //while loop. use for if you know number of iterations. if you dont, use while.
//        int i = 5;
//        while(i!=0){
//            System.out.println(i);
//            i--;
//        }
//
//        //do while
//        int userInput = 5;
//        while(userInput != 0){
//            System.out.println("Thank you for watching this video.");
//            userInput--;
//        }
//
//        //sample of break and continue used in a for loop
//        for(int g=0; g<10;g++) {
//            if (g == 2) {
//                //break;       //this will stop at 2
//                continue;      //this will continue to 10 but skip 2.
//            }
//            System.out.println(g);
//        }
//
//
//
//
//
//
////        Birds b = new Birds("small") {
////
////        }
////
////        b.eat();
//
//        //this is an example of casting. you can go from small to big but to go big to small, you need to add ()
//        //to specify the type.
////        double a = 9.0;
////        int b = (int) a;
////        System.out.println(a);
////        System.out.println(b);
////        int sum1 = 50 + 100;
////        int sum2 = sum1 + 250;
////        int sum3 = sum2 + sum2;
////
////        System.out.println(sum1);
////        System.out.println(sum2);
////        System.out.println(sum3);
//
//        //if/else/else if statements
//
////        int time = 19;
////
////        if(time < 10) {
////            System.out.println("Good morning");
////        } else if(time < 20){
////            System.out.println("Good day");
////        } else {
////            System.out.println("Good evening");
////        }
//
////        String text = "adobo";
////
////        if(text.equals("tacos")) {
////            System.out.println("Yay! Tacos!");
////
////        } else if(text.equals("pizza")) {
////            System.out.println("Yay! Pizza!");
////        } else if(text.equals("bulgogi")) {
////            System.out.println("Yay! Buglogi!");
////        } else if(text.equals("rice")) {
////            System.out.println("Yay! Rice");
////        } else if(text.equals("adobo")) {
////            System.out.println("Yay! Adobo!");
////        } else {
////            System.out.println("Nice Something new!");
////        }
//        //switch cases are not often used because of some logical issues but good for readability.
////            int day = 2;
////
////            switch(day) {
////                case 1:
////                    System.out.println("Monday");
////                    break;
////                case 2:
////                    System.out.println("Tuesday");
////                    break;
////                case 3:
////                    System.out.println("Wednesday");
////                    break;
////                case 4:
////                    System.out.println("Thursday");
////                    break;
////                case 5:
////                    System.out.println("Friday");
////                    break;
////                case 6:
////                    System.out.println("Saturday");
////                    break;
////                case 7:
////                    System.out.println("Sunday");
////                    break;
////                default:
////                    System.out.println("Not a valid day!");
////            }
//        //do a do while loop when you don't know how many times to run your code.
////                    int a = 7;
////                    do {
////                        System.out.println("I luv bacon");
////                        a++;
////                    } while(a <5);
////                int count = 1;
////
////                while(count <= 10) {
////                    System.out.println(count);
////                    count +=1; //the same as count++
////                }
//        //if you know how many times you do need to run code...
////                  String[] cars = {"bmw", "vw", "toyota"};
////                    //enhanced loop which is a cleaner way.
////                  for(String c : cars) {
////                      System.out.println(c);
////                  }
////                    String s = "Daft Punk";
////
////                    for(int i = 0; i < s.length(); i++) {
////                        System.out.println(s.charAt(i));
////                    }
//        //this is break and continue.
////                    for(int i = 0; i < 5; i++) {
////                        if(i == 3) {
////                            continue;
////                        }
////                        System.out.println(i);
////
////                        }
//        //integer array that's 2 dimensions
////                    int[][] a = {{3, 5, 1}, //row 0
////                                {7, 9, 1}}; //row 1, '7' is column 0
////                    System.out.println(a[1][1]); //output is '9' because row 1, column 1
////                    char[] characters = {'a', 'b', 'c', 'd'};
////
////                    for(int i = 0; i < characters.length; i++) {
////                        System.out.println(characters[i]);
////                    }
//        //characters.length doesn't have parenthesis because this is an attribute of an array,
//        // rather than a method. You'll learn more about this in the Object-Oriented Programming section.
//
//        //nested loops
////                    for(int i = 0; i < 3; i++) {
////
////                        for(int j = 0; j < 5; j++) {
////                            System.out.println(i + " " + j);
////                        }
////                    }
//
////        int[][] a = {{1,2,3},{4,5,6}};
////
////        for(int i = 0; i < a.length; i++) {
////            for(int j = 0; j < a[i].length; j++) {
////                System.out.println(a[i][j]);
////            }
////            System.out.println();
////        }
//
//
////        sayHi();
////    }
////        static void sayHi() {
////            System.out.println("hi!");
////        int a = add(4, 8);
////        double a = add(4.1, 8.4);
////        System.out.println(a);
////    }
////        static int add(int a, int b) {
////            return a + b;
////        }
////            //method overloading example makes methods more flexible.
////        static double add(double a, double b) {
////            return a + b;
//
//        //Recursion is a method called within itself.2 rules:1. it has to call itself inside the method
//        // and 2. it needs to know when to stop aka base case.
////        sayHi(5);
////    }
////        static void sayHi(int n) {
////        if(n == 0) {
////            System.out.println("done!");
////        } else {
////            System.out.println("hi");
////            n--;
////            sayHi(n);
////        }
//
////        System.out.println(factorial(4));
////
////    }
//////
////    static int factorial(int n) {
////        if(n != 0) {
////            System.out.println("Calling " + n + " * factorial(" + (n - 1) + ")");
////            return n * factorial(n - 1);
////        } else {
////            return 1;
////        }
//
////    Birds bigBird = new Birds();
////
////        System.out.println("The bird's color is: " + bigBird.color);
////        System.out.println("The bird's size is: " + bigBird.size);
////        bigBird.eat();
////        bigBird.sing();
////
////
////    Shirt hawaiianShirt = new Shirt();
////
////        System.out.println("The size of the shirt is: " + hawaiianShirt.size);
////        System.out.println("The price of the shirt is: " + hawaiianShirt.price);
////        System.out.println("The color of this shirt is: ");
////
////        Calculator calc = new Calculator(); //this is a new object instantiated from Calculator class.
////        System.out.println(calc.isEven(105));
////
////        LearnJava l = new LearnJava();    //method inside main class.
////        int a = l.subtract(8, 3);
////        System.out.println(a);
////
////    }
////
////    public int subtract(int a, int b) {
////        return a - b;
////    }
//
//
////            Birds b = new Birds(); //make a new object, special method called "CONSTRUCTOR"
////            b.eat(); //new method
////        }
////
//        //This is an new object created from Ukulele Class.
////        Ukulele martin = new Ukulele();
////        System.out.println("The type of wood of this ukulele is " + martin.wood);
////        System.out.println("The price is $" + martin.price + ".00");
////
////        martin.strum();
////        martin.fingerPick();
////        System.out.println("The preferred size of the ukulele is " + martin.size);
////
////        Ukulele
//
//        System.out.println(a);
//
//        LearnJava account = new LearnJava();
//
//        account.age = 34;
//        account.setName("Pablo");
//        account.setAge(34);
//        System.out.println(account.getAge());
//        System.out.println(account.getName());
//
//        account.printDetails();
//
//
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void printDetails() {
//        System.out.println(name + ", " + age);
//    }
//
//
//
//
//
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
