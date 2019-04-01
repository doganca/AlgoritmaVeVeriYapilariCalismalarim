package sorting.insertionSort;

public class IntertionSort {

    public static void intertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];

            int index = j - 1;

            while (index >= 0 && array[index] > key) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = key;
        }

    }
}
