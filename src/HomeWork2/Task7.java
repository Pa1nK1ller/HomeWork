package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        moveArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, moveReq());
    }

    private static int moveReq() {
        System.out.println("на сколько позиций хотите сдвинуть массив?\n" +
                "Положительное число будет сдвигать массив вправ ->\n" +
                "Отрицательно число будет сдвигать массив влево <-");
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.println("значение не подходит \nВведите новое число!");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        sc.close();
        return number;
    }

    private static void moveArr(int[] arr, int n) {
        int moveNum = n % arr.length;
        if (moveNum > 0) {
            for (int i = 0; i < Math.abs(n); i++) {
                int lastNum = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = lastNum;
            }
        } else {
            for (int i = 0; i < Math.abs(n); i++) {
                int firstNum = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = firstNum;
            }

        }
        System.out.println(Arrays.toString(arr) + " : Сдвинули массив на " + moveNum);
    }
}

