package main.java.food;

/**
 * This class describes options of carrot, its name and number of calories
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */

public class Carrot extends Vegetables {

    /**
     * the name of this vegetable
     */
    private final String name = "carrot";

    /**
     * Creates the Carrot object, with the weight specified in the parameters.
     *
     * @param weightGram - number of grams
     */
    public Carrot(double weightGram) {
        super(41, weightGram);
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
