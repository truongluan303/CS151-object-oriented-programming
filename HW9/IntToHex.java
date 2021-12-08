import java.util.Scanner;



public class IntToHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        String input = "";
        System.out.println("Please enter an integer!");

        
        // keep taking in input until it is valid
        while (!isValid) {
            System.out.print("> ");
            input = scanner.nextLine();

            if (!isInteger(input)) {
                System.out.println("Error!!! Invalid input!");
                System.out.println("Please re-enter a valid integer");
                isValid = false;
            }
            else {
                isValid = true;
            }
        }

        // convert to integer and then to hex
        int value = Integer.parseInt(input);
        String hex = Integer.toHexString(value).toUpperCase();

        // print output
        System.out.println("\n" + input + " is equivalent to \"" +
            hex + "\" in hexadecimal");
    }




    /**
     * @brief check if a given string can be converted to an integer
     * @param string the string to be checked
     * @return true if the given string can ber converted to integer type
     */
    public static boolean isInteger(String string) {
        try {
            @SuppressWarnings("unused")
            int temp = Integer.parseInt(string);
        }
        catch (Exception ignore) {
            return false;
        }
        return true;
    }
}