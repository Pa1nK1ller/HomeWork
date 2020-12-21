package HomeWork7;

public class Test {

    public static void main(String[] args) {

        Cat cat = new Cat("Мартин", 5);
        //Cat cat1 = new Cat("Мурзик",3);
        Plate plate = new Plate();

        plate.addFoot(4);
        cat.eat(plate);
        plate.printInfo();

    }
}