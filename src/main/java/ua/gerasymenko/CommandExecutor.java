package ua.gerasymenko;

import ua.gerasymenko.command.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is responsible for loading operations from the Map and saving them in it
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */

public class CommandExecutor {

    /**
     * Map, that contains all available operations with a salad
     */
    private static final Map<Operation, Command> allKnownCommandsMap
            = new HashMap<>();

    // Saving all operations in the Map
    static {
        allKnownCommandsMap.put(Operation.CHOICE, new ChoiceCommand());
        allKnownCommandsMap.put(Operation.PRINT, new PrintCommand());
        allKnownCommandsMap.put(Operation.SEARCH, new SearchCommand());
        allKnownCommandsMap.put(Operation.SORT, new SortCommand());
        allKnownCommandsMap.put(Operation.COUNT, new CountCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    private CommandExecutor() {
    }

    /**
     * This method gets operation from the Map and activates it
     *
     * @param operation - operation, that should be executed
     * @throws IOException
     */
    public static void execute(Operation operation) throws IOException {
        allKnownCommandsMap.get(operation).execute();
    }
}
