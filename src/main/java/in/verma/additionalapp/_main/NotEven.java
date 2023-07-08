package in.verma.additionalapp._main;
public class NotEven {
    public static void main(String[] args) {
        int[] array = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Количество нечетных чисел в массиве: " + count);
    }
}

