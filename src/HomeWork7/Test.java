package HomeWork7;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        Cat cat0 = new Cat("Мартин", random.nextInt(7) + 1);
        Cat cat1 = new Cat("Мурзик", random.nextInt(8) + 1);
        Cat cat2 = new Cat("Вискас", random.nextInt(5) + 1);
        Cat cat3 = new Cat("Тоби", random.nextInt(8) + 1);
        Cat cat4 = new Cat("Васька", random.nextInt(6) + 1);

        Plate plate0 = new Plate(random.ints(1, 10).findFirst().getAsInt());
        Plate plate1 = new Plate(random.ints(1, 10).findFirst().getAsInt());
        Plate plate2 = new Plate(random.ints(1, 10).findFirst().getAsInt());
        Plate plate3 = new Plate(random.ints(1, 10).findFirst().getAsInt());
        Plate plate4 = new Plate(random.ints(1, 10).findFirst().getAsInt());


        Cat[] cats = {cat0, cat1, cat2, cat3, cat4};
        Plate[] plates = {plate0, plate1, plate2, plate3, plate4};

        for (int i = 0; i < 3; i++) {
            System.out.println("День " + (i + 1));
            for (int j = 0; j < cats.length; j++) {
                plates[j].printInfo();
                cats[j].printInfo();
                System.out.println("Кот " + cats[j].getName() + " Кушает");
                cats[j].eat(plates[j], cats[j]);
                plates[j].printInfo();
                System.out.println("Добавим немного еды в тарелку");
                plates[j].addFoot(random.ints(1, 5).findFirst().getAsInt());
                System.out.println("\n");
            }

        }
    }
}