package HomeWork6;

public class Cat extends Animals {


    @Override
    void run(int length) {
        boolean result = length <= 200;
        if (result) _length = length;
        printInfo(this, " Run", result);
    }

    void jump(double height) {
        boolean result = height <= 2;
        if (result) _height = height;
        printInfo(this, " Jump", result);
    }

    @Override
    void swim(double lengthSwim) {
        printInfo(this, " Swim", false);
    }
}
