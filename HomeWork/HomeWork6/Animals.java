package HomeWork.HomeWork6;

public class Animals {


    private String nickname;
    private static int countAnimals;


    public Animals (String nickname) {
        this.nickname = nickname;
    }

    public String getNickname (){
        return nickname;
    }

    public void run (int distance){
        System.out.println("Животное" + nickname +" пробегает: " + distance + "м");
    }
    public void swim (int distance){
        System.out.println("Животное проплывает: " + distance + "м");
    }
   // public void count (){}

    public int setCount(){
        countAnimals++;
        return countAnimals;
    }

    public int getCount(){
        return countAnimals;
    }
}
