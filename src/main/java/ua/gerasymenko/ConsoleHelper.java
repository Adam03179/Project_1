package ua.gerasymenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class helps to show some information in a console and read input data.
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */

public class ConsoleHelper {

    /**
     * The single reader in the application, used by all reading methods
     */
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    /**
     * This method displays the text specified in the parameter
     *
     * @param message - the text that should be displayed
     */
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    /**
     * This method reads the text from the keyboard
     *
     * @return text inputted on keyboard
     * @throws IOException
     */
    public static String readString() throws IOException {
        String text = reader.readLine();
        return text;
    }

    /**
     * This method reads the integers from the keyboard
     *
     * @return integer inputted on keyboard
     * @throws IOException
     */
    public static int readInt() throws IOException {
        String text = readString();
        return Integer.parseInt(text.trim());
    }

    /**
     * This method reads the decimal number from the keyboard
     *
     * @return decimal number inputted on keyboard
     * @throws IOException
     */
    public static double readDouble() throws IOException {
        String text = readString();
        return Double.parseDouble(text.trim());
    }
}
