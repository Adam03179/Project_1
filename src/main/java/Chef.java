package main.java;

import java.io.IOException;

/**
 * This class realizes main-method and contains the salad, that is chosen
 * by user
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */

public class Chef {

    /**
     * The single object of Salad in this application,
     * it should be chosen by user
     */
    private static Salad salad;

    public static Salad getSalad() {
        return salad;
    }

    public static void setSalad(Salad salad) {
        Chef.salad = salad;
    }

    public static void main(String[] args) {

        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (NullPointerException e) {
                ConsoleHelper.writeMessage("Please, choose a salad first");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Wrong input, please try again");
            }
        } while (operation != Operation.EXIT);


    }

    /**
     * This method realizes main menu
     *
     * @return operation, that is chosen by user
     * @throws IOException
     */
    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Enter number of operation:");
        ConsoleHelper.writeMessage(String.format("\t %d - choose a salad",
                Operation.CHOICE.ordinal()));
        ConsoleHelper.writeMessage(String.format
                ("\t %d - show the composition of vegetable salad",
                        Operation.PRINT.ordinal()));
        ConsoleHelper.writeMessage(String.format
                ("\t %d - find a vegetable in a salad",
                        Operation.SEARCH.ordinal()));
        ConsoleHelper.writeMessage(String.format
                ("\t %d - sort the vegetables in a salad",
                        Operation.SORT.ordinal()));
        ConsoleHelper.writeMessage(String.format
                ("\t %d - count calories in a salad",
                        Operation.COUNT.ordinal()));
        ConsoleHelper.writeMessage(String.format
                ("\t %d - exit", Operation.EXIT.ordinal()));

        return Operation.values()[ConsoleHelper.readInt()];
    }
}
