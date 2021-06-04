import java.util.stream.IntStream;
import java.util.Arrays;

public class ArraysLec {
    public static void main(String[] args) {  //data of arrays must be the same data type.
        //in javascript, you can put many different types like numbers, strings, arrays
        //in this example, must be all int.  how we start an array is data type [] then variable name

        int[] numbers = {14, 64, 34, 44};
        numbers[1] = 33;  //you can change number at index 1
//        numbers[4] = 74; //there is NO index 4. there is no .push like javascript.
        //arrays in Java are STATIC not dynamic like Javascript. JS you can add, not Java. It's SET length.
        for (int number : numbers) { //
            System.out.println(number);
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] topFiveBoyNames = new String[5];

        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Geoff";
        topFiveBoyNames[3] = "Naysa";
        topFiveBoyNames[4] = "Hideo";

        for (String name : topFiveBoyNames) {
            System.out.println(name);
        }

        boolean[] lookingAtDefaultVals = new boolean[3]; //boolean array

        for (boolean boo : lookingAtDefaultVals) {
            System.out.println(boo);
        }

        //like integer parse int, there's an array util.

        Arrays.fill(lookingAtDefaultVals, true);

        for (boolean boo : lookingAtDefaultVals) {
            System.out.println(boo);
        }

        Arrays.fill(topFiveBoyNames, "Jim");

        for (String name : topFiveBoyNames) {
            System.out.println(name);
        }

        int[] alsoNums = {14, 33, 34, 44};

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int number: alsoNums) {
            System.out.println(number);
        }

        System.out.println(Arrays.equals(numbers, alsoNums));

//        int[]
//
//        int[] numbersAgain = numbers;
//
//        System.out.println(yetMoreNums == numbers);

    }
}
