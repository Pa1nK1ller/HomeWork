package HomeWork2;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(checkBalanceArr(new int[]{23,45}));
        System.out.println(checkBalanceArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(checkBalanceArr(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1,}));
        System.out.println(checkBalanceArr(new int[]{11, 12, 13, 11, 12, 13, 11, 12, 13}));
        System.out.println(checkBalanceArr(new int[]{2,2,2,1,2,2,9,1,1}));
        System.out.println(checkBalanceArr(new int[]{2,2,2,1,2,2,0,10,1}));
        System.out.println(checkBalanceArr(new int[]{1,1,1,2,1}));
        System.out.println(checkBalanceArr(new int[]{2,2,2,0,3}));
    }

    private static boolean checkBalanceArr(int[] array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int sum : array) rightSum += sum;
        if (((array.length-1)<1)||(rightSum % 2 != 0))
            return false;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            if (leftSum == rightSum) {
                insertBorder(array, i);
                return true;
            }
            else if (leftSum>rightSum)
                return false;
        }
        return false;
    }

    private static void insertBorder(int[] arr, int arrIndex) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arrIndex)
                System.out.print("||" + " ");
        }
    }
}
