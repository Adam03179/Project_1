package main.java.food;

/**
 * This class describes options of beet, its name and number of calories
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */

public class Beet extends Vegetables {

    /**
     * the name of this vegetable
     */
    private final String name = "beet";

    /**
     * Creates the Beet object, with the weight specified in the parameters.
     *
     * @param weightGram - number of grams
     */
    public Beet(double weightGram) {
        super(49, weightGram);
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
