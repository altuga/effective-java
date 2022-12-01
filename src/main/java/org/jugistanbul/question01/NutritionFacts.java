package org.jugistanbul.question01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    private final int servingSize ; // must
    private final int servings ; // must
    private final int calories ; // optional
    private final int fat ;  // optional
    private final int sodium ; // optional
    private final int carbohydrate ; // optional

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder setCalories(int val) {
            calories = val;
            return this;
        }

        public Builder setFat(int val) {
            fat = val;
            return this;
        }

        public Builder setCarbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder setSodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

     private NutritionFacts(Builder builder) {
             servingSize = builder.servingSize;
             servings = builder.servings;
             calories = builder.calories;
             fat = builder.fat;
             sodium = builder.sodium;
             carbohydrate = builder.carbohydrate;
      }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) throws IOException {

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10,20).
                setFat(10).
                setSodium(100).build();

        System.out.println(" " + nutritionFacts);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
    }

}
