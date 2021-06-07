package practice;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //write your code here
        byte age = 30; //int is whole numbers, no decimal. 30 is the intial value.
        long viewsCount = 3_123_456_789L; //L is a suffix.
        float price = 10.99F; //F means float as a suffix.
        char letter = 'A'; //'' single quotes for single characters.  Double for strings.
        boolean isEligible = false;
        Date now = new Date(); //instance of the date class.
        now.getTime();
        byte x = 1;
        byte y = x;

        x = 2;
        Point point1 = new Point(1, 1);
            Point point2 = point1;
            point1.x = 2; //changing to 2
        System.out.println(point2);

        String message = "   Hello World" + "!!  ";
        message.endsWith("!!");
        System.out.println(message);
        System.out.println(message.replace("!","*"));
        //Strings are immutable, you cannot change. so This would be a new string. Original is not changed.
        System.out.println(message.trim()); //removes extra white spaces. this message.trim() is a new string
        //same thing message.toLowerCase is a new string.
        String windows = "c:\\Windows\\...";
        System.out.println(windows);
        System.out.println(y);
        System.out.println(age);
        System.out.println(now);

        //Arrays

        int [] numbers = new int[5]; //specifying the number of elements.
        numbers[0] = 1;
        numbers[1] = 2;
//        numbers[10] =3; //this will cause a crash and an exception.
        //add Array  import on top
        System.out.println(Arrays.toString(numbers));

        int [] numeros = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        Arrays.sort(numeros);

        //multidimension arrays to store a matrix
        int [] [] numbers2 = { {1,2,3}, {4,5,6}};

        System.out.println(Arrays.deepToString(numbers2));

        final float pi = 3.14F; //F for float...decimal.

        int result = 10 +3;
        System.out.println(result);
        int z = 10 + 3 * 2;
        System.out.println(z);

        //Implicit casting - automatic conversion.
        //byte > short > int > long
        short a = 1;   //short takes 2 bytes
        int b = a + 2; //int takes 4 bytes
        System.out.println(b);

        //Convert from String to Int.
        String d = "1";
        int e = Integer.parseInt(d) + 2;
        System.out.println(e);

        int results = Math.round(1.1F);
        System.out.println(results);

    }
}
