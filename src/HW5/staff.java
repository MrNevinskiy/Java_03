package HW5;

public class staff {
        String fullName;
        String worker;
        String email;
        String phoneNumber;
        String salary;
        int age;

        @Override
            public String toString() {
                return "\n" + " Staff{" +
                    " FullName='" + fullName + '\'' +
                    ", Worker='" + worker + '\'' +
                    ", Email='" + email + '\'' +
                    ", PhoneNumber='" + phoneNumber + '\'' +
                    ", Salary='" + salary + '\'' +
                    ", Age=" + age +
                    '}';
        }

            public staff(String fullName, String worker, String email, String phoneNumber, String salary, int age){
                this.fullName = fullName;
                this.worker = worker;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
        }

            public int getAge(){

            return age;
        }

}
