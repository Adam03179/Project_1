package main.java.command;

import java.io.IOException;

/**
 * This interface implements all the operations that can be performed
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public interface Command {
    /**
     * The execution method of operation
     *
     * @throws IOException
     */
    void execute() throws IOException;
}
