package ua.gerasymenko.command;

import ua.gerasymenko.ConsoleHelper;
import ua.gerasymenko.Chef;
import ua.gerasymenko.food.Vegetables;

import java.io.IOException;
import java.util.List;

/**
 * This class describes methods of realisation of command - "search"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class SearchCommand implements Command {

    /**
     * Realisation of command - "search"
     *
     * @throws IOException
     */
    @Override
    public void execute() throws IOException {

        ConsoleHelper.writeMessage("\t Please, enter minimum calories:");
        double min = ConsoleHelper.readDouble();
        ConsoleHelper.writeMessage("\t Please, enter maximum calories:");
        double max = ConsoleHelper.readDouble();
        List<Vegetables> result = Chef.getSalad().searchByCalories(min, max);

        if (result.isEmpty())
            ConsoleHelper.writeMessage("vegetables with input parameters are missing");

        for (Vegetables veg : result) {
            ConsoleHelper.writeMessage(veg.getName() + "(" + veg.getCalories()
                    + " kcal " + ", " + veg.getWeightGram() + " gram" + ")"
                    + ", ");
        }
    }
}
