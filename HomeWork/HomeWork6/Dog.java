package HomeWork.HomeWork6;

public class Dog extends Animals{

    private static int countDog;

    public Dog (String nickname){
        super (nickname);
        setCountDog();
        setCount();
    }

    @Override
    public void run (int distance){
        if (distance <= 500){
            System.out.println(getNickname() + " пробежал " + distance + "м.");
        } else {
            System.out.println(getNickname() + " пробежал 500м.");
        }
    }
    @Override
    public void swim (int distance){
        if (distance <= 10){
            System.out.println(getNickname() + " проплыл " + distance + "м.");
        } else {
            System.out.println(getNickname() + " проплыл 10м.");
        }
    }
    public int setCountDog(){
        countDog++;
        return countDog;
    }
    public int getCountDog(){
        return countDog;
    }
}
