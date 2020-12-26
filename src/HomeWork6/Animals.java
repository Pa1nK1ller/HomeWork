package HomeWork6;

abstract class Animals {
    protected int _length;
    protected double _height;
    protected double _lengthSwim;

    abstract void run(int length);

    abstract void jump(double height);

    abstract void swim(double lengthSwim);

    static void printInfo(Object obj, String nameMethod, boolean result) {
        System.out.println(obj.getClass().getName() + nameMethod + " : " + result);
    }
}

