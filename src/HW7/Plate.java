package HW7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public void decreaseFood(int foodCount){
        this.food -= foodCount;

    }

    public void setFood(int food) {
        this.food = food;
    }

    public void infoFeed(){
        System.out.println("Тарелочка: " + food);
    }

    public boolean isFoodEnough(int foodCount){
        return getFood() >= foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
