package ua.gerasymenko.food;

/**
 * This class describes options of tomato, its name and number of calories
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Tomato extends Vegetables {

    /**
     * the name of this vegetable
     */
    private final String name = "tomato";

    /**
     * Creates the Tomato object, with the weight specified in the parameters.
     *
     * @param weightGram - number of grams
     */
    public Tomato(double weightGram) {
        super(18, weightGram);
    }

    @Override
    public double getCalories() {
        return super.getCalories();
    }


    @Override
    public double getWeightGram() {
        return super.getWeightGram();
    }


    @Override
    public double getCaloriesInHundredGrams() {
        return super.getCaloriesInHundredGrams();
    }

    public String getName() {
        return name;
    }
}
