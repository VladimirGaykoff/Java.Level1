package HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {

        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray(arr1);

        int [] emptyArr = new int [100];
        fillArray(emptyArr);

        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationArray(arr3);

        int [][] arr4 = new int [6][6];
        fillDiagonalArray(arr4);

        int [] arr5 = newArray(6, 13);
        for (int i = 0; i < arr5.length; i++){
            System.out.print(arr5[i] + " "); //Проверка созданного массива
        }

        int [] arr6 = {1, 15, 23, 69, -5, 225, 0, 75, -96, 11};
        findMaxAndMin(arr6);

        int[] arr7 = {1, 2, 3, 4, 1, 1, 2, 2, 2, 2};// для положительного ответа
        //int[] arr7 = {1, 2, 3, 4, 1, 1, 5, 2, 2, 2};// для отрицательного ответа
        boolean isArr7Right = checkArray(arr7);
        System.out.print(isArr7Right);
    }

    public static void changeArray (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            //System.out.print(arr[i] + " ");  // проврка исправленного массива
        }

    }

    public static void fillArray (int[] arr){
        int numm = 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = numm;
            numm += 1;
            //System.out.print(arr[i] + " ");  // проврка заполняемости массива
        }
    }

    public static void multiplicationArray (int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            //System.out.print(arr[i] + " ");  // проврка перезаполнения массива
        }

    }

    public static void fillDiagonalArray (int [][] arr){
        int endIndex = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++){
            arr[i][endIndex-i] = 1;
            for (int j = 0; j < arr[i].length; j++){
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");  // проврка заполнения диагоналей массива
            }
            System.out.println();
        }
    }

    public static int[] newArray (int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMaxAndMin (int[] arr){
        int arrMin = arr[0];
        int arrMax = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arrMin >= arr[i]) arrMin = arr[i];
            if (arrMax <= arr[i]) arrMax = arr[i];
        }
        System.out.println("Максимальное число в массиве: " + arrMax);
        System.out.print("Минимальное число в массивве: " + arrMin);
    }

    public static boolean checkArray (int[] arr){
        int summArr = 0;

        for (int i = 0; i < arr.length; i++){
            summArr += arr[i];
        }
        int remind = summArr % 2 ;
        if (remind != 0) {
            return false;
        }
        int halfSumm = summArr / 2;
        int leftHalf = 0;
        for (int i = 0; i < arr.length; i++) {
            leftHalf += arr[i];
            if (leftHalf == halfSumm) return true;
            else if (leftHalf > halfSumm) return false;
        }
        return true;
    }
    }



