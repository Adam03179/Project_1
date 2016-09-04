package ua.gerasymenko;

import ua.gerasymenko.food.Vegetables;

import java.util.*;

/**
 * The class used to store the list of classes of vegetables, contains methods
 * for the implementation of the operations related to the salad.
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Salad {
    /**
     * List of vegetables, which are a part of salad
     */
    private List<Vegetables> vegetables;

    /**
     * ua.gerasymenko.Salad name
     */
    private String name;

    /**
     * Creates empty ua.gerasymenko.Salad object with name
     */
    public Salad() {
        this.name = "";
        vegetables = new ArrayList<>();
    }

    /**
     * Creates ua.gerasymenko.Salad object with name
     *
     * @param name - salad name
     */
    public Salad(String name) {
        vegetables = new ArrayList<>();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method creates a Comparator object for further use in sorting by calories
     *
     * @return Comparator object for sorting by calories
     */
    private Comparator<Vegetables> comparatorByCalories() {

        Comparator<Vegetables> result = new Comparator<Vegetables>() {
            public int compare(Vegetables o1, Vegetables o2) {
                if (o1.getCalories() < o2.getCalories()) {
                    return -1;
                } else if (o1.getCalories() == o2.getCalories()) {
                    return 1;
                } else return 0;
            }
        };

        return result;
    }

    /**
     * Method creates a Comparator object for further use in sorting by weight
     *
     * @return Comparator object for sorting by weight
     */
    private Comparator<Vegetables> comparatorByWeight() {

        Comparator<Vegetables> result = new Comparator<Vegetables>() {
            @Override
            public int compare(Vegetables o1, Vegetables o2) {
                if (o1.getWeightGram() < o2.getWeightGram()) {
                    return -1;
                } else if (o1.getWeightGram() == o2.getWeightGram()) {
                    return 1;
                } else return 0;
            }
        };

        return result;
    }

    /**
     * Method adds a vegetable to the salad
     *
     * @param vegetable - one of the objects of Vegetable classes
     */
    public void addVegetableToSalad(Vegetables vegetable) {
        vegetables.add(vegetable);

    }

    /**
     * Method counts calories of the salad
     *
     * @return number of calories in the salad
     */
    public double countCalories() {
        double calories = 0;

        for (int i = 0; i < vegetables.size(); i++) {
            calories += vegetables.get(i).getCalories();
        }

        return calories;
    }

    /**
     * Method searches vegetables in the salad, witch satisfy the requirements
     * of parameters
     *
     * @param minCalories - minimum number of calories, that vegetable should have
     * @param maxCalories - maximum number of calories, that vegetable should have
     * @return List of vegetables, that satisfy the requirements of parameters
     */
    public List<Vegetables> searchByCalories(double minCalories,
                                             double maxCalories) {
        List<Vegetables> result = new ArrayList<>();

        for (Vegetables vegetables : this.vegetables) {
            if ((vegetables.getCalories() >= minCalories)
                    && (vegetables.getCalories() <= maxCalories)) {
                result.add(vegetables);
            }
        }

        return result;
    }

    /**
     * Method sorting vegetables by calories
     */
    public void sortByCalories() {
        Collections.sort(vegetables, comparatorByCalories());
    }

    /**
     * Method sorting vegetables by weight
     */
    public void sortByWeight() {
        Collections.sort(vegetables, comparatorByWeight());
    }


    @Override
    public String toString() {

        String result = "Salad " + "\"" + name + "\"" + " consist from ";

        for (Vegetables veg : vegetables) {

            result += veg.getName() + "(" + veg.getCalories() + " kcal " + ", "
                    + veg.getWeightGram() + " gram" + ")" + ", ";
        }

        result += ".";
        result = result.replace(", .", ".");

        return result;
    }
}
