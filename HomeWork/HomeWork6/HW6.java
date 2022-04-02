package HomeWork.HomeWork6;

public class HW6 {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Барсик");
        Cat catTishka = new Cat("Тишка");
        Dog dogMuhtar = new Dog("Мухтар");
        Dog dogBobik = new Dog("Бобик");
        Dog dogSharik = new Dog("Шарик");

        // catBarsik.getCount(); - общее количество животных
        //catBarsik.getCountCat(); - количесвто кошек
        //dogBobik.getCountDog(); - количество собак

        System.out.println("Создано " + catBarsik.getCountCat() + " кота(ов) и " + dogBobik.getCountDog() + " собак(и). Всего " + catBarsik.getCount() + " животное(ых).");
        System.out.println();

        catBarsik.run(150);
        catTishka.swim(25);
        dogMuhtar.run(450);
        dogBobik.swim(15);
        dogSharik.swim(5);


    }
}
