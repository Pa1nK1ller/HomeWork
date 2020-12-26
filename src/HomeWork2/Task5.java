package HomeWork2;

public class Task5 {
    public static void main(String[] args) {
        int [] arr={4,1,6,9,25,11,56,2,756,-5,-111,1215};
        int min = arr[0],max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min= Math.min(arr[i],min);
            max= Math.max(arr[i], max);

        }
        System.out.println("Минимальное значение = "+ min);
        System.out.println("Максимальное значение = "+ max);
    }
}
