package ua.gerasymenko.command;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.gerasymenko.Chef;
import ua.gerasymenko.ConsoleHelper;
import ua.gerasymenko.Salad;
import ua.gerasymenko.food.*;

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

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

        switch (choice) {
            case 1: {
                Chef.setSalad((Salad)applicationContext.getBean("saladSpring"));                          //(new Salad("spring"));
                Chef.getSalad().addVegetableToSalad((Tomato)applicationContext.getBean("tomato120"));     //new Tomato(120));
                Chef.getSalad().addVegetableToSalad((Cucumber)applicationContext.getBean("cucumber100")); //new Cucumber(100));
                Chef.getSalad().addVegetableToSalad((Onion) applicationContext.getBean("onion50"));       // new Onion(50));
            }
            break;
            case 2: {
                Chef.setSalad((Salad)applicationContext.getBean("saladAutumn"));                          // new Salad("autumn"));
                Chef.getSalad().addVegetableToSalad((Beet) applicationContext.getBean("beet320"));        //new Beet(320));
                Chef.getSalad().addVegetableToSalad((Carrot)applicationContext.getBean("carrot200"));     //new Carrot(200));
                Chef.getSalad().addVegetableToSalad((Onion)applicationContext.getBean("onion80"));        //new Onion(80));
                Chef.getSalad().addVegetableToSalad((Potato)applicationContext.getBean("potato120"));     //new Potato(120));
            }
            break;
            case 3: {
                Chef.setSalad((Salad)applicationContext.getBean("saladSummer"));                          //(new Salad("summer"));
                Chef.getSalad().addVegetableToSalad((Beet) applicationContext.getBean("beet320"));        //new Beet(320));
                Chef.getSalad().addVegetableToSalad((Carrot)applicationContext.getBean("carrot200"));     //new Carrot(200));
                Chef.getSalad().addVegetableToSalad((Onion)applicationContext.getBean("onion80"));        //new Onion(80));
                Chef.getSalad().addVegetableToSalad((Potato) applicationContext.getBean("potato120"));    //new Potato(120));
            }
            break;
            default:
                ConsoleHelper.writeMessage("Wrong input, please try again");
                break;

        }

    }
}
