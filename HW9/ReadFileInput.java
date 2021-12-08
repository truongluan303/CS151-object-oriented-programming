import java.io.*;
import java.util.Scanner;



public class ReadFileInput {

    private final static String FILENAME = "quote.txt";


    public static void main(String[] args) {
        try {
            File file = new File(FILENAME);
            Scanner fileScanner = new Scanner(file);
            
            // keep reading as long as there are lines remaining
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}