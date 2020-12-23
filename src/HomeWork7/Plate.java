package HomeWork7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

   public void addFoot(int food) {
        this.food += food;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске осталось " + food+" еды";
    }

    public void decreaseFood(int appetite, Cat cat) {
        if (appetite > food) {
            System.out.println("в миске не хватило еды");
        } else {
            food -= appetite;
            cat.setHungry(false);
        }

    }
}
