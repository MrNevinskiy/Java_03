package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
    task1();
    task2();
    }
    public static void task1(){
        System.out.println("Отгадайте число от 0 - 9");;
        int max = 9;
        int min = 0;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        do{
            int random = (int)(Math.random() * max);
            for (int i = 3; i >= 0; i--) {
                System.out.println("У вас есть " + i + " попытка.");
                int answer = in.nextInt();
                if (answer == random) {
                    System.out.println("Вы угадали!");
                } else {
                    System.out.println("Попробуйте снова!");
                }
                if(i == 0){
                    System.out.println("Хотите поробывать снова? 1/да 2/нет");
                }
            }
        }while(in2.next().equals("1"));
    }
    public static void task2() {
//        Scanner answer = new Scanner(System.in);
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
//                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
//                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        String SelectedWord = words[(int)Math.floor(Math.random()*words.length)];
//        System.out.println("Я загадаю для вас одно слово из списка ниже, а вы должны угадать." + Arrays.toString(words));
//        String User;
//        StringBuilder add = new StringBuilder("##################")
//        do {
//            System.out.println("Какое слово я загадал? (Напишите ваш ответ с маленькой буквы)");
//          User = answer.nextLine();
//          if(User == SelectedWord){
//              System.out.println("Вы угадали");
//          }else{
//          }
//        }while();
    }
}

