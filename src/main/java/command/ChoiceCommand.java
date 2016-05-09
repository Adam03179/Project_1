package main.java.command;

import main.java.ConsoleHelper;
import main.java.Salad;
import main.java.Chef;
import main.java.food.*;

import java.io.IOException;

/**
 * This class describes methods of realisation of command - "choice"
 * with salad
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class ChoiceCommand implements Command {

    /**
     * Realisation of command - "choice"
     *
     * @throws IOException
     */
    @Override
    public void execute() throws IOException {
        ConsoleHelper.writeMessage("please, choose salad from the list:");
        ConsoleHelper.writeMessage("\t 1. Salad from tomato, cucumber and onion");
        ConsoleHelper.writeMessage("\t 2. Salad from beet, carrot, onion and potato");
        ConsoleHelper.writeMessage("\t 3. Salad from cabbage, carrot and onion");
        int choice = ConsoleHelper.readInt();

        switch (choice) {
            case 1: {
                Chef.setSalad(new Salad("spring"));
                Chef.getSalad().addVegetableToSalad(new Tomato(120));
                Chef.getSalad().addVegetableToSalad(new Cucumber(100));
                Chef.getSalad().addVegetableToSalad(new Onion(50));
            }
            break;
            case 2: {
                Chef.setSalad(new Salad("autumn"));
                Chef.getSalad().addVegetableToSalad(new Beet(320));
                Chef.getSalad().addVegetableToSalad(new Carrot(200));
                Chef.getSalad().addVegetableToSalad(new Onion(80));
                Chef.getSalad().addVegetableToSalad(new Potato(120));
            }
            break;
            case 3: {
                Chef.setSalad(new Salad("autumn"));
                Chef.getSalad().addVegetableToSalad(new Beet(320));
                Chef.getSalad().addVegetableToSalad(new Carrot(200));
                Chef.getSalad().addVegetableToSalad(new Onion(80));
                Chef.getSalad().addVegetableToSalad(new Potato(120));
            }
            break;
            default:
                ConsoleHelper.writeMessage("Wrong input, please try again");
                break;

        }

    }
}
