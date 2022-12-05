package org.jugistanbul.question01;

/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 */

/*
TODO: 
 1 - Initialize (create) the class according to the fields below
 2 - Instructor will show the solutions
 3 - Refactor and ask questions
 */
public class NutritionFacts {

    private int servingSize = 0; // must
    private int servings = 0; // must
    private int calories = 0; // optional
    private int fat = 0;  // optional
    private int sodium = 0; // optional
    private int carbohydrate = 0; // optional

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }


    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);

        System.out.println(cocaCola);
    }


}
