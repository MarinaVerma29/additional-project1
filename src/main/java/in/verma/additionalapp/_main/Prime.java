package in.verma.additionalapp._main;

public class Prime {
    public static void main(String[] args) {
        int[] array = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                count++;
            }
        }
        System.out.println("Количество простых чисел в массиве равно: " + count);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
