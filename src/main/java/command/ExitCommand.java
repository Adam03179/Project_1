package main.java.command;

import main.java.ConsoleHelper;

/**
 * This class describes methods of realisation of command - "exit"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class ExitCommand implements main.java.command.Command {

    /**
     * Realisation of command - "exit"
     */
    @Override
    public void execute() {
        ConsoleHelper.writeMessage("Good bye!");
    }
}
