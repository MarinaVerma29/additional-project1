package in.verma.additionalapp._main;

public class SumIndex {
    public static void main(String[] args) {
        int[] array = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int sumEvenIndex = 0;
        int sumNotEvenIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEvenIndex += array[i];
            } else {
                sumNotEvenIndex += array[i];
            }
        }

        int difference = sumEvenIndex - sumNotEvenIndex;
        System.out.println("Разность между суммой чисел, имеющих четный индекс, и суммой чисел, имеющих нечетный индекс, в массиве: " + difference);
    }
}

