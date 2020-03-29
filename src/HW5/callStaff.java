package HW5;

import java.util.Arrays;

public class callStaff {
    public static void main(String[] args) {
        staff[] staffArray = new staff[6];
        staffArray[0] = new staff("Ivan Ivanov", "Engineer", "ivanov@mm.ru", "+2 212 331 322", "30000", 30);
        staffArray[1] = new staff("Roma Romanov", "Teacher", "romanov@mm.ru", "+2 212 432 342", "40000", 33);
        staffArray[2] = new staff("Vova Vovanov", "Accountant", "vovanov@mm.ru", "+2 323 432 342", "50000", 40);
        staffArray[3] = new staff("Peter Petrov", "Builder", "petrov@mm.ru", "+2 212 432 342", "35000", 42);
        staffArray[4] = new staff("Kiril Kirilovich", "Cook", "kirilovich@mm.ru", "+2 212 390 342", "90000", 50);
        staffArray[5] = new staff("Elena Malysheva", "Doctor", "malysheva@mm.ru", "+2 616 432 342", "220000", 59);
        System.out.println(Arrays.toString(staffArray));
        System.out.print("\nРаботники страше 40 лет.\n");
        for (staff item : staffArray) {
            if (item.getAge() > 40) System.out.print(item.toString());;
        }
    }
}

