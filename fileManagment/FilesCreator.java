package fileManagment;

import java.io.*;

public class FilesCreator {
    public static void createFile(String fileName) {
        File f = new File(fileName);
        try {
            PrintWriter p = new PrintWriter(f);
            p.close();
            System.out.println("file created");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void readFile(String filename) {
        File f = new File(filename);
        try {
            BufferedReader entry = new BufferedReader(new FileReader(f));
            var read = entry.readLine();
            while (read != null) {
                System.out.println(read);
                read = entry.readLine(); //salta y almacena lee linea por linea
            }
            entry.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addTextToFile(String fileName, String content) {
        File f = new File(fileName);
        try {
            PrintWriter p = new PrintWriter(new FileWriter(fileName, true));
            p.println(content);
            p.close();
            System.out.println("file write succesfully");

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void writeFile(String fileName, String content) {
        File f = new File(fileName);
        try {
            PrintWriter p = new PrintWriter(f);
            p.println(content);
            p.close();
            System.out.println("file write succesfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
}
