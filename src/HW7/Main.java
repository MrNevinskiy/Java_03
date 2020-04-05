package HW7;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(70);
        Cat[] cats = new Cat[5];
        for (int i = 0; i < 5; i++) {
            cats[i] = new Cat();
            System.out.println("_____________________________________");
            plate.infoFeed();
            System.out.println(cats[i] + " Кот голодный? " + !cats[i].isSatiety());
            cats[i].eat(plate);
            plate.infoFeed();
            if(!cats[i].isSatiety()){
                System.out.println("Добавим немного еды.");
                plate.addFood(30);
                plate.infoFeed();
                cats[i].eat(plate);
            }
            System.out.println(cats[i] + " Кот голодный? " + !cats[i].isSatiety());
        }
    }
}

