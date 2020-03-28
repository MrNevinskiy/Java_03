package HW5;

import java.util.Arrays;

public class Call_Staff {
    public static void main(String[] args) {
        Staff[] StaffArray = new Staff[6];
        StaffArray[0] = new Staff("Ivan Ivanov", "Engineer", "ivanov@mm.ru", "+2 212 331 322", "30000", 30);
        StaffArray[1] = new Staff("Roma Romanov", "Teacher", "romanov@mm.ru", "+2 212 432 342", "40000", 33);
        StaffArray[2] = new Staff("Vova Vovanov", "Accountant", "vovanov@mm.ru", "+2 323 432 342", "50000", 40);
        StaffArray[3] = new Staff("Peter Petrov", "Builder", "petrov@mm.ru", "+2 212 432 342", "35000", 42);
        StaffArray[4] = new Staff("Kiril Kirilovich", "Cook", "kirilovich@mm.ru", "+2 212 390 342", "90000", 50);
        StaffArray[5] = new Staff("Elena Malysheva", "Doctor", "malysheva@mm.ru", "+2 616 432 342", "220000", 59);
        System.out.println(Arrays.toString(StaffArray));
        System.out.println("Работники страше 40 лет.");
        for (Staff item : StaffArray) {
            if (item.Age40() > 40) item.Show40();
        }
    }
}

