package main.java.food;

/**
 * This abstract class describes the basic components of vegetables,
 * which necessary for the application
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */

public abstract class Vegetables {

    /**
     * The name of this vegetable
     */
    private final String name = "";

    /**
     * The number of calories in this vegetable
     */
    private final double calories;

    /**
     * The number of calories in 100 gram of this vegetable
     */
    private final double caloriesInHundredGrams;

    /**
     * The weight of this vegetable
     */
    private final double weightGram;

    /**
     * Creates the vegetable, and counts number of calories in it
     *
     * @param caloriesInHundredGrams - number of calories in this vegetable
     * @param weightGram             - weight of this vegetable
     */
    public Vegetables(double caloriesInHundredGrams, double weightGram) {
        this.caloriesInHundredGrams = caloriesInHundredGrams;
        this.weightGram = weightGram;
        this.calories = (weightGram * caloriesInHundredGrams) / 100;
    }

    public double getCalories() {
        return calories;
    }

    public double getWeightGram() {
        return weightGram;
    }

    public double getCaloriesInHundredGrams() {
        return caloriesInHundredGrams;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
