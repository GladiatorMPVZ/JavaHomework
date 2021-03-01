public class Main {

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        emplArray[1] = new Employee("Sergey Sergeev", "Director", "3142@mail.ru", 234523, 50000, 42);
        emplArray[2] = new Employee("Alex Alex", "Defender", "fgjhgh@gmail.com", 654313, 25000, 56);
        emplArray[3] = new Employee("Bob Ivanov", "Klerk", "42454pkg@icloud.com", 598713314, 15000, 26);
        emplArray[4] = new Employee("Vasiliy Prohorov", "Hacker", "dfl12lj41lk@mail.ru", 2435645, 80000, 50);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > 40)
                System.out.println(emplArray[i]);

        }
    }
}
