package HW6;

public class Dog extends Animals {

    public Dog(String name, String color, int age, int run, double jump, int swim) {
        super(name, color, age, run, jump, swim);
    }

//    protected final int SWIM_MAX_DOG = 10;
//    protected final int RUN_MAX_DOG = 500;
//    protected final double JUMP_MAX_DOG = 0.5;

    @Override
    public boolean getSwim() {
        if(swim > 10){
            System.out.println("Собака не может плавать больше 10 м.");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean getRun() {
        if(run > 500){
            System.out.println("Животное не может бежать больше 500 м.");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean getJump() {
        if(jump > 0.5){
            System.out.println("Животное не может прыгать выше чем 0.5 м.");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        System.out.println("Собака умеет плавать до: " + swim + "м.");
        return super.toString();
    }
}
