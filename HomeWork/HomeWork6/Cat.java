package HomeWork.HomeWork6;

public class Cat extends Animals{

    private static int countCat = 0;

    public Cat (String nickname){
        super (nickname);
        setCountCat();
        setCount();
    }

    @Override
    public void run (int distance){
        if (distance <= 200){
            System.out.println(getNickname() + " пробежал " + distance + "м.");
        } else {
            System.out.println(getNickname() + " пробежал 200м.");
        }
    }
    @Override
    public void swim (int distance){
        System.out.println(getNickname() + " не умеет плавать.");
    }

    public int setCountCat(){
        countCat++;
        return countCat;
    }

    public int getCountCat(){
        return countCat;
    }
}
