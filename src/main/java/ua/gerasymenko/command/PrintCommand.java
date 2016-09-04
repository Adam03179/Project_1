package ua.gerasymenko.command;

import ua.gerasymenko.ConsoleHelper;
import ua.gerasymenko.Chef;

/**
 * This class describes methods of realisation of command - "print"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class PrintCommand implements Command {

    /**
     * Realisation of command - "print"
     */
    @Override
    public void execute() {
        ConsoleHelper.writeMessage(Chef.getSalad().toString());
    }
}
