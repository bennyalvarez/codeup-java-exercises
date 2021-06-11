import java.io.IOException;
import java.nio.file.*;        //* means everything, wildcard. class is a pattern, and class is a protocol.  object
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//has knowledge in instance variables and it can do things(methods).  Instance is an object knowing things.
//nio is a bunch of classes. Files stored on our system.  Files all have a place on our system based on path. Root
//down the hierarchy. We need to tell input output objects where the file is.
//Paths.get method is a method of the gets path.  It can take many strings.
//ex. of what will NOT work...  Path thisWontWork = Paths.get()

public class FileIOLecture {

    public static void main(String[] args) {
        Path pathToSrc = Paths.get("src");
        System.out.println(pathToSrc);
        System.out.println(pathToSrc.toAbsolutePath()); //it represents were our path is on our computer.

        Path thisWillWork = Paths.get(String.valueOf(pathToSrc), "FileIOLecture.java");
        System.out.println(thisWillWork);

        //this creates a folder named data.
        Path toOurDataPlace = Paths.get("src/data");
        System.out.println(toOurDataPlace);

        try {
            if (Files.notExists(toOurDataPlace)){      //if "src/data" does not exist, create one.
                Files.createDirectories(toOurDataPlace);
            } else {
                System.out.println("The " + toOurDataPlace + " directory already exists.");
            }
            Files.createDirectories(toOurDataPlace);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        //writing a file
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");

        try {
            if (Files.notExists(toOurDataPlace)){
                Files.createDirectories(toOurDataPlace);
            } else {
                System.out.println("The " + toOurDataPlace + " directory already exists.");
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        try {
            if (Files.notExists(toOurDataFile)) {
                Files.createFile(toOurDataFile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //write to a file

        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Domna");


    }
}
