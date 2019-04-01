package sorting.mergeSort;

public class MergeSort {

    public static void mergeSort(int[] array) {
        smashArray(array, 0, array.length - 1);
    }

    private static void smashArray(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;

            smashArray(array, p, q);

            smashArray(array, q + 1, r);

            merge(array, p, q, r);
        }
    }

    private static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = array[q + 1 + j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
    }
}
