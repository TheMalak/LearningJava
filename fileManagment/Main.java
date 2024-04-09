package fileManagment;
import java.io.FileNotFoundException;

import static fileManagment.FilesCreator.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "helloWorld.txt";
        //createFile(fileName);
        //addTextToFile(fileName, "hello world");
        //addTextToFile(fileName, "more data");
        readFile(fileName);
    }
}
