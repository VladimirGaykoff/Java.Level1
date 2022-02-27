package HomeWork;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;



public class HW4 {
    public static void main(String[] args) {
        int sizeOfMap = 5;
        int countTurn = sizeOfMap * sizeOfMap;
        boolean isEndOfGame = false;
        String[][] map = buildMap(sizeOfMap);
        printMap(map);

        while (true) {
            playerTurn(map);
            printMap(map);
            if (isEndOfGame = examination(map, sizeOfMap)){
                break;
            };
            countTurn--;
            if (countTurn == 0){
                System.out.println("Ничья");
                //isEndOfGame = false;
                break;
            }

            computerTurn(map);
            printMap(map);
            if (isEndOfGame = examination(map, sizeOfMap)){
                break;
            };
            countTurn--;
        }

    }

    public static String[][] buildMap(int size) {
        String[][] arr = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = "*";
                //  System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }
        return arr;
    }

    public static void printMap(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void playerTurn(String[][] map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ход игрока.");
        System.out.println("Введите номер строки и столбца вашего хода:");
        while (true) {
            int y = sc.nextInt();
            int x = sc.nextInt();

            if (y < 1 || y > map.length || x < 1 || x > map.length) {
                System.out.println("Вы не попали в поле!!!");

            } else if (map[y - 1][x - 1].equals("*")) {
                map[y - 1][x - 1] = "X";
                break;
            } else {
                System.out.println("Вы указали занятую ячейку");
            }
        }
    }

    public static void computerTurn(String[][] map) {
        Random rnd = new Random();
        System.out.println("Ход компьютера.");

        while (true) {
            int y = rnd.nextInt(map.length);
            int x = rnd.nextInt(map.length);


            if (map[y][x].equals("*")) {
                map[y][x] = "O";
                break;
            }
        }

    }

    public static boolean examination(String[][] map, int size) {
        int   c = 0, d = 0;
        int endIndex = map[0].length - 1;
        for (int i = 0; i < map.length; i++) {
            if (map[i][endIndex - i].equals("X")) {
                d += 1;
            } else if (map[i][endIndex - i].equals("O")) {
                d += -1;
            }
            int a = 0, b = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("X")) {
                    a += 1;
                } else if (map[i][j].equals("O")) {
                    a += -1;
                }
                if (map[j][i].equals("X")) {
                    b += 1;
                } else if (map[j][i].equals("O")) {
                    b += -1;
                }

                if (i == j) {
                    if (map[i][j].equals("X")) {
                        c += 1;
                    } else if (map[i][j].equals("O")) {
                        c += -1;
                    }
                }

                if (a == size || b == size || c == size) {
                    System.out.println("Победил игрок");
                    return true;
                } else if (a == (size * -1) || b == (size * -1) || c == (size * -1)) {
                    System.out.println("Победил компьютер");
                    return true;
                }

            }
            if (d == size) {
                System.out.println("Победил игрок");
                return true;
            } else if (d == (size * -1)) {
                System.out.println("Победил компьютер");
                return true;
            }
        }
        return false;
    }
}
