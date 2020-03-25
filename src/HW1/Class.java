package HW1;

public class Class {
    public static void main(String[] args) {
        task1();
        System.out.println(("") + task2(3, 5,6,2));
        System.out.println(("") + task3(5, 10));
        System.out.println(("") + task4(-2));
        System.out.println(("") + task5(2));
        task6("Alex");
        task7(2020);
    }
    static void task1() {
        System.out.println("Задание номер 1: Ответ в коде. ");
        //1 Целочисленные
        byte Byte = 1;
        short Short = 2;
        int Int = 3;
        long Long = 4;

        //2 Дробные
        float Float = 1.0F;
        double Double = 1.0;

        //3 Символьный
        char Char = 'a';

        //4 Логический
        boolean Boolean = true; //false
    }
    static int task2 (int a, int b, int c, int d) {
        System.out.println("Задание номер 2: ");
        return a * (b + (c / d));
    }
    static boolean task3 (int a, int b){
        System.out.println("Задание номер 3: ");
        int c = a + b;
        if (c < 10 || c > 20){
            return false;
        }else{
            return true;
        }
    }
    static int task4 (int a){
        System.out.println("Задание номер 4: ");
        if (a < 0){
            System.out.println("Число отрицательное.");
        }else{
            System.out.println("Число положительное.");
        }return a;
    }
    static boolean task5 (int a){
        System.out.println("Задание номер 5: ");
        if (a < 0){
            return true;
        }else{
            return false;
        }
    }
    static void task6 (String a){
        System.out.println("Задание номер 6: ");
        System.out.println("" + a);
    }
    static void task7 (int a){
        System.out.println("Задание номер 7: ");
        if(a % 4 != 0){
            System.out.println("Обычный");
        }else if( a % 400 == 0 || a % 100 == 0){
            System.out.println("Обычный");
        }else{
            System.out.println("Високосный");
        }
    }
}
