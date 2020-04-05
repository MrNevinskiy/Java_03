package HW7;

import java.util.Random;

public class Cat {

    private CatName name;
    private int appetite;
    private boolean satiety;
    private static Random rnd = new Random();
    private static final int MAX_APPETITE = 20;
    private static final int MIN_APPETITE = 15;

    public Cat() {
        name = CatName.values()[rnd.nextInt(CatName.values().length)];
        appetite = MIN_APPETITE + rnd.nextInt((MAX_APPETITE - MIN_APPETITE));
    }

    public boolean eat(Plate plate){
        if(plate.isFoodEnough(appetite) && !satiety){
            plate.decreaseFood(appetite);
            satiety = true;
            return true;
        }
        return false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                " Имя = " + name +
                ", Аппетит = " + appetite +
                '}';
    }
}
