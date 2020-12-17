package HomeWork6;

public class Dog extends Animals {


    @Override
    void run(int length) {
        boolean result = length <= 500;
        if (result) _length = length;
        printInfo(this, " Run", result);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result) _height = height;
        printInfo(this, " Jump", result);

    }

    @Override
    void swim(double lengthSwim) {
        boolean result = lengthSwim <= 10;
        if (result) _lengthSwim = lengthSwim;
        printInfo(this, " Swim", result);
    }
}
