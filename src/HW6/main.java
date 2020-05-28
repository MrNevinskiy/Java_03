package HW6;

import java.util.Arrays;

public class main {
//    1. Создать классы Собака и Кот с наследованием от класса Животное.
//    2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//    В качестве параметра каждому методу передается величина, означающая или длину препятствия
//    (для бега и плавания), или высоту (для прыжков).
//    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//    прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//    4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
//    (Например, dog1.run(150); -> результат: run: true)

    public static void main(String[] args) {
        System.out.println("Данные и максимальные праметры животных:");
        Dog dog1 = new Dog("Барсик", "Белый", 2, 500, 0.5, 10 );
        Cat cat1 = new Cat("Васька","Чёрный",3, 200, 2, 0);
        System.out.println(Arrays.toString(new Dog[]{dog1}));
        System.out.println(Arrays.toString(new Cat[]{cat1}));

        System.out.println("Изменяемые параметры собаки:");
        dog1.setRun(500);
        dog1.setJump(0.5);
        dog1.setSwim(10);

        System.out.println("Изменяемык параметры кота");
        cat1.setRun(200);
        cat1.setJump(2);
        cat1.setSwim(0);
    }
}
