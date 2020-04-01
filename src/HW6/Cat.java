package HW6;

public class Cat extends Animals {

    public Cat(String name, String color, int age, int run, double jump, int swim) {
        super(name, color, age, run, jump, swim);
    }

//    protected final int SWIM_MAX_CAT = 0;
//    protected final int RUN_MAX_CAT = 200;
//    protected final double JUMP_MAX_CAT = 2;

    @Override
    public boolean getRun() {
        if(run > 200){
            System.out.println("Животное не может бежать больше 200 м.");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean getJump() {
        if(jump > 2){
            System.out.println("Животное не может прыгать выше чем 2 м.");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean getSwim() {
        if(swim > 0){
            System.out.println("Животное не плавает");
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        System.out.println("Кот не умеет плавать.");
        return super.toString();
    }
}
