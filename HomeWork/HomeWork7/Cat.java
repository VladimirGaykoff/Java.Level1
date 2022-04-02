package HomeWork.HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public int countHungryCat = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
       // p.decreaseFood(appetite);
        if (p.getFood() > appetite) {
            p.setFood(p.getFood() - appetite);
            this.satiety = true;
        }
        else {
         //   setCountHungryCat();
            this.satiety = false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety(){
        return satiety;
    }
    public void satietyInfo() {
        if (this.satiety == true) {
            System.out.println(getName() + " сыт");
        } else {
            System.out.println(getName() + " голоден");
        }
    }

}
