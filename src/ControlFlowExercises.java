import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. a. while loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " " );
//            i++;
//        }
        //doing it 'print' goes side by side instead of vertical.
        //refactored version as for loop
        //for (int i = 100; i >= -10; i -=5){
        //      System.out.println(i);
        // }

        //1b. Do While
        //part 1
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);



        //part 2
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        //for loop version
//        for (int i = 100; i >= -10; i -=5){
//            System.out.println(i);
//        }

        //part3 when i put i <= 65536, it causes infinite loop
//        int i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 65536);

    //javier's version
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while ( i < 1000000);

    //for loop
//        for (long i = 2L; i < 1000000; i *=i){
//            System.out.println(i);
//        }



//2.

//        Scanner scanner1 = new Scanner(System.in);
//        final int PIN = 12345;
//        int userInput = 0;
//        int attempts = 1;
//        while (attempts <=3){
//            System.out.println("Please enter pin: ");
//            userInput = scanner1.nextInt();
//            if (userInput != PIN){
//                if (attempts < 3){
//                    System.out.println("Incorrect, try again");
//                } else {
//                    System.out.println("Sorry but you have been locked out.");
//                }
//            } else {
//                System.out.println("Correct, welcome back");
//                break;
//            }
//            attempts++;
//        }

        //2a
//            for(int i = 1; i <= 100; i++) {
//                System.out.println(i);
//            }
        //2b + 2c
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

            //2d
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //3

//        System.out.println("What number would you like to go up to? ");
//        Scanner scanner = new Scanner(System.in);
//        int userNum = scanner.nextInt();
//        System.out.printf("The number you entered is %d%n", userNum);
//
//        System.out.println("Here is your table!");
//
//        System.out.println("number | squared | cubed");
//        System.out.println("_______|_________|______");
//
//
//        for(int i = 1; i <= userNum; i++) {
//            int number = i;
//            int squared = i*i;
//            int cubed = i*i*i;
////            System.out.println(number + "|" + squared + "|" + cubed);
//        System.out.printf("%d      |%2d        |%d     %n", number,squared, cubed);
//        }


        //4. Convert given number grades into letter grades


        Scanner scanner1 = new Scanner(System.in);
        String userChoice = "y";
        while (!userChoice.equals("n")) {
            System.out.println("Enter the student's numerical grade: ");
            short grade = scanner1.nextShort();
            char letterGrade;
            if (grade>0 && grade <=59){
                letterGrade = 'F';
            } else if (grade > 59 && grade <= 66) {
                letterGrade = 'D';
            } else if (grade > 66 & grade <= 79){
                letterGrade = 'C';
            } else if (grade > 79 && grade <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade? (y/n)");
            userChoice = scanner1.next();
        }






    }
}
