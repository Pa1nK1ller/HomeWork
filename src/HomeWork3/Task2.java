package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        System.out.println(word);
//        System.out.println(readAnswer());
        String userAnswer = new String(readAnswer());
        if (word.equals(userAnswer)){
            System.out.println("Ответ верный");
        }

    }

    private static String readAnswer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Попробуй угадать слово");
        String answer = new String(scan.nextLine());
        return answer;
    }
}
