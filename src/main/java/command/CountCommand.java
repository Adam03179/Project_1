package main.java.command;

import main.java.ConsoleHelper;
import main.java.Chef;

import java.io.IOException;

/**
 * This class describes methods of realisation of command - "count"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class CountCommand implements Command {

    /**
     * Realisation of command - "count"
     *
     * @throws IOException
     */
    @Override
    public void execute() throws IOException {
        ConsoleHelper.writeMessage(Chef.getSalad().countCalories()
                + " Kcal in the Salad");
    }
}
