package in.verma.additionalapp._main;

public class Zero {
        public static void main(String[] args) {
            int[] array = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    count++;
                }
            }

            System.out.println("Количество раз, которое число 0 встречается в массиве: " + count);
        }
    }

