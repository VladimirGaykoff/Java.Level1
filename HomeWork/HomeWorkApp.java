package HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {

        isSummOfNumberRight(-3,15);
        //System.out.println(isSummOfNumberRight(-3,15));

        printNumberIsPositive(25);

        isNumberPositive(13);
        //System.out.println(isNumberPositive(13));

        printMultipleTimes("Напечатай меня", 9);

        isYearLeap(1998);
        //System.out.println(isYearLeap(2012));
    }

    public static boolean isSummOfNumberRight (int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNumberIsPositive (int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " - положительное");
        } else {
            System.out.println("Число " + number + " - отрицательное");
        }
    }

    public static boolean isNumberPositive (int number){
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printMultipleTimes (String line, int count){
        for (int i = 0; i < count; i++){
            System.out.println(line);
        }
    }

    public static boolean isYearLeap(int year){
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    }



