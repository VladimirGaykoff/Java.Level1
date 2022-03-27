package HomeWork.HomeWork7;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 25);
        cat[1] = new Cat("Pushok", 15);
        cat[2] = new Cat("Vaska", 20);
        cat[3] = new Cat("Boris", 50);
        cat[4] = new Cat("Candy", 20);
        plate.info();

        int getCountHungryCat = 0;

        for (int i = 0; i < cat.length; i++){
            cat[i].eat(plate);
            cat[i].satietyInfo();
            if (cat[i].getSatiety() == false) {
                getCountHungryCat++;
            }
        }
        plate.info();

        if (getCountHungryCat != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("В тарелке недостаточно корма, чтобы накормить всех котов.");
            System.out.println("Сколько добавить корма в тарелку?");
            int f = sc.nextInt();
            plate.setFood(plate.getFood() + f);
        }

        plate.info();
//        cat.eat(plate);
//        plate.info();
//        cat.satietyInfo();
    }
}
