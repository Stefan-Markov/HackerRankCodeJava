package FactoryPattern;

import java.util.Scanner;

interface Food {
    String getType();
}

class Pizza implements Food {

    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        return "pizza".equals(order) ? new Pizza() : new Cake();
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned class " + food.getClass().getSimpleName());
        System.out.println(food.getType());
    }
}