package HomeWork1;

import java.util.Scanner;

public class
HomeWork {
    public static void main(String[] args) {
//        InitVar(); //1-2 пункт дз
//        System.out.println("a * (b + (c / d)) = " + sumVars(500.1, 500.5, 1000., 0)); //3 пункт дз
//        rangeCheck(11, 9.1);//4 пункт дз
//        checkNumber1();//5 пункт дз
//        System.out.println(checkNumber2());// 6 пункт дз
//        System.out.println("Привет, " + inputName() + ("!"));//7 пункт дз
//        checkYear();// 8 пункт дз
    }

    private static long inputNumber() {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        long number;
        while (!sc.hasNextLong()) {
            System.out.println("Вы ввели не целое число!!! \nВведите целое число!");
            sc = new Scanner(System.in);
        }
        number = sc.nextLong();
        sc.close();
        return number;
    }

    private static void InitVar() {
        byte VarByte = 64;
        short VarShort = 128;
        int VarInt = 512;
        long VarLong = 1024L;
        float VarFloat = 20.48f;
        double VarDouble = 40.96;
        char VarChar1 = '^';
        char VarChar2 = '\u2648';
        boolean VarBool = true;
    }

    private static double sumVars(double a, double b, double c, double d) {
        Scanner sc = new Scanner(System.in);
        while (d == 0) {
            System.out.println("Делить на 0 нельзя, введите другое значение переменной d");
            d = Double.parseDouble(sc.nextLine());
        }
        sc.close();
        return a * (b + (c / d));
    }

    private static void rangeCheck(double check1, double check2) {

        if ((check1 + check2) >= 10 && (check1 + check2) <= 20)
            System.out.println(true);
        else System.out.println(false);

    }

    private static void checkNumber1() {
        if (inputNumber() >= 0)
            System.out.println("Вы ввели положительно число");
        else System.out.println("Вы ввели отрицательно число");
    }

    private static boolean checkNumber2() {
        long number = inputNumber();
        if (number < 0)
            return true;
        else return false;
    }

    private static String inputName() {
        System.out.println("Введите ваше имя");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void checkYear() {
        System.out.println("Введите Год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year%4==0  & year%100!=0)||(year%400==0))
            System.out.println(year + " Год Високосный");
        else System.out.println(year + " Год не високосный");
    }

}

