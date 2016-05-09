package main.java.command;

import main.java.ConsoleHelper;
import main.java.Chef;

import java.io.IOException;

/**
 * This class describes methods of realisation of command - "sort"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class SortCommand implements Command {

    /**
     * Realisation of command - "sort"
     *
     * @throws IOException
     */
    @Override
    public void execute() throws IOException {
        ConsoleHelper.writeMessage("Please, make a choice:");
        ConsoleHelper.writeMessage("\t 1. Sort by weight");
        ConsoleHelper.writeMessage("\t 2. Sort by calories");
        double choice = ConsoleHelper.readDouble();

        if (choice == 1) {
            Chef.getSalad().sortByWeight();
        } else if (choice == 2) {
            Chef.getSalad().sortByCalories();
        }

        ConsoleHelper.writeMessage("It is done!");


    }
}
