package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int value = arrValue();
        int[][] sqArr = new int[value][value];
        for (int i = 0; i < sqArr.length; i++) {
            sqArr[i][i] = sqArr[i][(sqArr.length - 1) - i] = 1;
        }
        for (int[] ints : sqArr) {
            System.out.println(Arrays.toString((ints)));
        }
    }

    private static int arrValue() {
        System.out.println("Введите размер квадратного массива");
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.println("Введенное значение не подходит!!! \nВведите новое число!");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        sc.close();
        return number;
    }
}
