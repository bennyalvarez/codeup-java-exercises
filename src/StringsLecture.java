import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        char character = 'd';
        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
        String bob = "Uncle Bob";
        System.out.println("Who is your favorite uncle?");
        String maybeBob = scanner.nextLine();
//        System.out.println(bob.equals(maybeBob));
        //strings have different methods like bob == maybeBob, you can do like above example.
        System.out.println("User answered with correct answer AND capitalization: " + bob.equals(maybeBob));
        System.out.println("User answered with correct answer: " + bob.equalsIgnoreCase(maybeBob));
        //CTL + R plays Java

        //Compare the start and end of Strings
        String david = "David";
        String dad = "Dad";
        String firstLetterDavid = ("" + david.charAt(0)).toLowerCase(Locale.ROOT);
        //strings are 0 indexed.
        System.out.println("David_and_Dad start with the same letter?: " + dad.startsWith(firstLetterDavid));

        String coolCats = "Cool Cats are cool, and we like it like that.";
        System.out.println(coolCats.toLowerCase(Locale.ROOT).startsWith("cool"));
        System.out.println(coolCats.endsWith("that."));

        //charAt will bring us back index,

        int locationOfAInDad = dad.indexOf("a");
        System.out.println("The location of 'a' in the string of \"Dad\" is: " + locationOfAInDad);

        int coolCatsLength = coolCats.length();
        System.out.println(coolCatsLength);

        String hiDad = "Hello, Father!";
        String father = hiDad.substring(7, 13);
        System.out.println(father);
        System.out.println(hiDad.replace(father, dad));
        System.out.println(hiDad);
        hiDad = hiDad.replace(father, dad);
        System.out.println(hiDad);

        String hasWhitespace = "     Oh that's a lot of white space, huh?     ";
        System.out.println(hasWhitespace.trim());
        System.out.println(hasWhitespace);

        String makeMeWork = "\"%s\" totally works in a souf";
//        System.out.println(makeMeWork, dad);















    }
}
