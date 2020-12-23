package HomeWork7;

public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    private int appetite;

    private boolean hungry;

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "У кота " + name + " аппетит = " + appetite;
    }

    public void eat(Plate plate, Cat cat) {
        plate.decreaseFood(appetite, cat);
        checkHungry();
        if (hungry == false) {
            System.out.println("кот наелся");
        }
    }

    private void checkHungry() {

    }

}
