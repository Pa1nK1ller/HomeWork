package HomeWork7;

import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private boolean hungry;
    private Random random = new Random();

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }
    public void eat(Plate plate) {
        plate.decreaseFood(random.nextInt(4) + 3);
    }

}
