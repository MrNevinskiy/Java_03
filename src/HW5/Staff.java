package HW5;

import java.util.Arrays;

public class Staff {
        String FullName;
        String Worker;
        String Email;
        String PhoneNumber;
        String Salary;
        int Age;

        @Override
            public String toString() {
                return "\n" + " Staff{" +
                    " FullName='" + FullName + '\'' +
                    ", Worker='" + Worker + '\'' +
                    ", Email='" + Email + '\'' +
                    ", PhoneNumber='" + PhoneNumber + '\'' +
                    ", Salary='" + Salary + '\'' +
                    ", Age=" + Age +
                    '}';
        }

            public Staff(String FullName, String Worker, String Email, String PhoneNumber, String Salary, int Age){
                this.FullName = FullName;
                this.Worker = Worker;
                this.Email = Email;
                this.PhoneNumber = PhoneNumber;
                this.Salary = Salary;
                this.Age = Age;
        }

            public int Age40(){
                return Age;
        }
            public void Show40(){
                System.out.println("\n" + " Staff{" +
                    " FullName='" + FullName + '\'' +
                    ", Worker='" + Worker + '\'' +
                    ", Email='" + Email + '\'' +
                    ", PhoneNumber='" + PhoneNumber + '\'' +
                    ", Salary='" + Salary + '\'' +
                    ", Age=" + Age +
                    '}');
        }
}
