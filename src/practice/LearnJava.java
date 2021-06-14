package practice;

public class LearnJava {
    public static void main(String[] args) {
        //this is an example of casting. you can go from small to big but to go big to small, you need to add ()
        //to specify the type.
//        double a = 9.0;
//        int b = (int) a;
//        System.out.println(a);
//        System.out.println(b);
//        int sum1 = 50 + 100;
//        int sum2 = sum1 + 250;
//        int sum3 = sum2 + sum2;
//
//        System.out.println(sum1);
//        System.out.println(sum2);
//        System.out.println(sum3);

        //if/else/else if statements

//        int time = 19;
//
//        if(time < 10) {
//            System.out.println("Good morning");
//        } else if(time < 20){
//            System.out.println("Good day");
//        } else {
//            System.out.println("Good evening");
//        }

//        String text = "adobo";
//
//        if(text.equals("tacos")) {
//            System.out.println("Yay! Tacos!");
//
//        } else if(text.equals("pizza")) {
//            System.out.println("Yay! Pizza!");
//        } else if(text.equals("bulgogi")) {
//            System.out.println("Yay! Buglogi!");
//        } else if(text.equals("rice")) {
//            System.out.println("Yay! Rice");
//        } else if(text.equals("adobo")) {
//            System.out.println("Yay! Adobo!");
//        } else {
//            System.out.println("Nice Something new!");
//        }
        //switch cases are not often used because of some logical issues but good for readability.
//            int day = 2;
//
//            switch(day) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default:
//                    System.out.println("Not a valid day!");
//            }
        //do a do while loop when you don't know how many times to run your code.
//                    int a = 7;
//                    do {
//                        System.out.println("I luv bacon");
//                        a++;
//                    } while(a <5);
//                int count = 1;
//
//                while(count <= 10) {
//                    System.out.println(count);
//                    count +=1; //the same as count++
//                }
        //if you know how many times you do need to run code...
//                  String[] cars = {"bmw", "vw", "toyota"};
//                    //enhanced loop which is a cleaner way.
//                  for(String c : cars) {
//                      System.out.println(c);
//                  }
//                    String s = "Daft Punk";
//
//                    for(int i = 0; i < s.length(); i++) {
//                        System.out.println(s.charAt(i));
//                    }
        //this is break and continue.
//                    for(int i = 0; i < 5; i++) {
//                        if(i == 3) {
//                            continue;
//                        }
//                        System.out.println(i);
//
//                        }
        //integer array that's 2 dimensions
//                    int[][] a = {{3, 5, 1}, //row 0
//                                {7, 9, 1}}; //row 1, '7' is column 0
//                    System.out.println(a[1][1]); //output is '9' because row 1, column 1
//                    char[] characters = {'a', 'b', 'c', 'd'};
//
//                    for(int i = 0; i < characters.length; i++) {
//                        System.out.println(characters[i]);
//                    }
        //characters.length doesn't have parenthesis because this is an attribute of an array,
        // rather than a method. You'll learn more about this in the Object-Oriented Programming section.

        //nested loops
//                    for(int i = 0; i < 3; i++) {
//
//                        for(int j = 0; j < 5; j++) {
//                            System.out.println(i + " " + j);
//                        }
//                    }

//        int[][] a = {{1,2,3},{4,5,6}};
//
//        for(int i = 0; i < a.length; i++) {
//            for(int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//            System.out.println();
//        }


//        sayHi();
//    }
//        static void sayHi() {
//            System.out.println("hi!");
//        int a = add(4, 8);
//        double a = add(4.1, 8.4);
//        System.out.println(a);
//    }
//        static int add(int a, int b) {
//            return a + b;
//        }
//            //method overloading example makes methods more flexible.
//        static double add(double a, double b) {
//            return a + b;

        //Recursion is a method within itself.2 rules:1. it has to call itself inside the method
        // and 2. it needs to know when to stop aka base case.
//        sayHi(5);
//    }
//        static void sayHi(int n) {
//        if(n == 0) {
//            System.out.println("done!");
//        } else {
//            System.out.println("hi");
//            n--;
//            sayHi(n);
//        }

//        System.out.println(factorial(4));
//
//    }
//
//    static int factorial(int n) {
//        if(n != 0) {
//            System.out.println("Calling " + n + " * factorial(" + (n - 1) + ")");
//            return n * factorial(n - 1);
//        } else {
//            return 1;
//        }

    Birds bigBird = new Birds();

        System.out.println("The bird's color is: " + bigBird.color);
        System.out.println("The bird's size is: " + bigBird.size);
        bigBird.eat();
        bigBird.sing();


    Shirt hawaiianShirt = new Shirt();

        System.out.println("The size of the shirt is: " + hawaiianShirt.size);
        System.out.println("The price of the shirt is: " + hawaiianShirt.price);
        System.out.println("The color of this shirt is: ");

    Calculator calc = new Calculator(); //this is a new object instantiated from Calculator class.
        System.out.println(calc.isEven(105));

    }

}











