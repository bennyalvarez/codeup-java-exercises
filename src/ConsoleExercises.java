import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number.");
        int userNum = scanner.nextInt();
        System.out.printf("The number you entered is " + userNum + "%n");

        System.out.println("Enter three words.");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.printf(first + "%n" + second + "%n" + third + "%n");

        scanner.nextLine();
        System.out.print("Please enter a sentence.");
        String sentence = scanner.nextLine();
        System.out.print("You have entered: " +sentence);



        System.out.println("Please enter values of length and width of a classroom at Codeup.");
        String length = scanner.nextLine();
        int valueL = Integer.parseInt(length);
        String width = scanner.nextLine();
        int valueH = Integer.parseInt(width);

        System.out.println("The area of a rectangle is equal to " + valueH * valueL +", and the perimeter of a rectangle is equal to " +valueL*2 + valueH*2 + ".");

    }
}
