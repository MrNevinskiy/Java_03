package HW6;

public abstract class Animals {

    private String name;
    private String color;
    private int age;
    protected int run;
    protected double jump;
    protected int swim;

    public Animals(String name, String color, int age, int run, double jump, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getRun() {
        return true;
    }

    public void setRun(int run) {
        this.run = run;
        System.out.println(getRun());
    }

    public boolean getJump() {
        return true;
    }

    public void setJump(double jump) {
        this.jump = jump;
        System.out.println(getJump());
    }

    public boolean getSwim() {
        return true;
    }

    public void setSwim(int swim) {
        this.swim = swim;
        System.out.println(getSwim());
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", run=" + run +
                ", jump=" + jump +
                ", swim=" + swim +
                '}';
    }
}
