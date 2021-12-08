import java.io.*;
import java.util.Scanner;


public class CreateFile {

    private final static String FILENAME = "command_line_input.txt";
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            File file = new File(FILENAME);                 // file object
            FileWriter fr = new FileWriter(file, true);     // file writer with append mode on
            BufferedWriter br = new BufferedWriter(fr);     // buffered writer object
            PrintWriter printer = new PrintWriter(br);      // printer to output to textfile 

            System.out.println("\nProgram Started!\n");
            String userLine;
            while (true) {

                System.out.print("> ");
                userLine = scanner.nextLine();

                // break when user enters "@q"
                if (userLine.equals("@q")) {
                    break;
                }
                
                printer.println(userLine);
            } 

            // close the writers
            printer.close();
            br.close();
            fr.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}