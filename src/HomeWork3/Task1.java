package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    private static final int NUM_ATTEMPTS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            System.out.println("Я загадал число от 0 до 9, Попробуй угадать ☺ ");
            while (count < NUM_ATTEMPTS && guess != number) {
                guess = answer();
                if (number != guess) {
                    System.out.println("Ваша цифра " +
                            ((guess > number) ? "больше" : "меньше") + " загаданной");
                    count++;
                }
            }
            System.out.println("Ты " + ((guess == number) ? "Угадал!" : "Проиграл: " + number));
            System.out.println("Повторить игру? Да - 1, Нет - 0");
        } while (sc.nextInt() == 1);
    }

    private static int answer() {
        System.out.println("Введите число от 0 до 9");
        Scanner scan = new Scanner(System.in);
        int answerNum = scan.nextInt();
        return answerNum;
    }
}
