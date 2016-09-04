package ua.gerasymenko.food;

/**
 * This class describes options of onion, its name and number of calories
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Onion extends Vegetables {

    /**
     * the name of this vegetable
     */
    private final String name = "cabbage";

    /**
     * Creates the Onion object, with the weight specified in the parameters.
     *
     * @param weightGram - number of grams
     */
    public Onion(double weightGram) {
        super(40, weightGram);
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
