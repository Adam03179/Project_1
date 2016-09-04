package ua.gerasymenko.command;

import ua.gerasymenko.ConsoleHelper;

/**
 * This class describes methods of realisation of command - "exit"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class ExitCommand implements Command {

    /**
     * Realisation of command - "exit"
     */
    @Override
    public void execute() {
        ConsoleHelper.writeMessage("Good bye!");
    }
}
