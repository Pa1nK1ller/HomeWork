package HomeWork7;

public class Plate {

    private int food;

    public void addFoot(int food) {
        this.food += food;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate: food = " + food;
    }
    public int decreaseFood(int appetiteCount) {
        if (appetiteCount > food) {
            appetiteCount -= food;
            food = 0;
            System.out.println("Миска пуста");
            return appetiteCount;
        }
        food -= appetiteCount;
        return 0;

    }
}
