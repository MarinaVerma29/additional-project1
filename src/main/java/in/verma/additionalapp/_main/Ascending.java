package in.verma.additionalapp._main;
import java.util.Arrays;
public class Ascending {
    public static void main(String[] args) {
        int[] arr = new int[] {2, -3, 1, 1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        }
        public static void sortArray(int[] array) {
            Arrays.sort(array);
        }
    }
