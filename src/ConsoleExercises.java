import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //1. format floating point numbers
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        //2. Scanner
        System.out.println("Give me a number.");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        System.out.printf("The number you entered is %d%n", userNum);

        //3.
        System.out.println("Enter three words.");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.printf(first + "%n" + second + "%n" + third + "%n");

        //david's version...

        System.out.println("Give me a word!");
        String str1 = scanner.next();
        System.out.println("Another one.");
        String str2 = scanner.next();
        System.out.println("Another one.");
        String str3 = scanner.next();

        System.out.printf("You entered the strings: \"%s\", \"%s\", and \"%s\".", str1, str2, str3);



        System.out.print("Please enter a sentence.");
        scanner.nextLine(); //to clear out the scanner.
        String sentence = scanner.nextLine();
        System.out.print("You have entered: " +sentence);


        //Perimeter Calculator

        System.out.println("Give me a length in meters:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters. %nGive me a width in meters:%n", length);
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("Length entered: %d meters.%nWidth entered: %d meters. %nArea of room: %d meters squared.%nPerimeter of room: %d meters.%n", length, width, area, perimeter);


    }
}

