package util;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input (){
        this.scanner = new Scanner(System.in); //created a constructor.

    }

    public String getString(){ //getter
        System.out.println("Please enter a sentence");
        String input = scanner.nextLine();
        return input;
    }



    public boolean YesNo(){
        System.out.println("Yes or No?");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }


    public int getInt() {
        return this.scanner.nextInt();
    }


    public int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d", min, max);
        int userNumber = this.scanner.nextInt();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getInt(min, max);

        }
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) { //printf is float..decimal.
        System.out.printf("Give me a decimal number between %f and %f", min, max);
        double userNumber = this.scanner.nextDouble();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getDouble(min, max);
        }
    }




}

