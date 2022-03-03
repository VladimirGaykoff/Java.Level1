package HomeWork5;

public class HW5 {
    public static void main(String[] args) {

        Person[] emloyee = new Person[5];
        emloyee[0] = new Person("Иванов Иван Тванович", "Директор", "IvanovII@mail.ru", "89201234567", 100000, 56);
        emloyee[1] = new Person("Петров Сегвей Викторович", "Заместитель директора", "PetrovSV@mail.ru", "89201234568", 90000, 50);
        emloyee[2] = new Person("Светлова Наталья Владимировна", "Главный бухгалтер", "SvetlovaNV@mail.ru", "89201234569", 80000, 52);
        emloyee[3] = new Person("Дорохов Андрей Иванович", "Программист", "DorohovAI@mail.ru", "89201234570", 70000, 29);
        emloyee[4] = new Person("Усов Егор Петрович", "Аналитик", "UsovEP@mail.ru", "89201234571", 60000, 31);

        for (int i = 0; i < emloyee.length; i++) {
            int age = emloyee[i].getAge();
            if (age > 40) {
                emloyee[i].getEmployeeData();
                System.out.println();
            }
        }
    }
}