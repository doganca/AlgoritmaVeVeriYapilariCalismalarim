package sorting;

import sorting.mergeSort.MergeSort;

import java.util.Arrays;
import java.util.Random;

import static sorting.insertionSort.IntertionSort.intertionSort;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1_900_500; i *= 2) {
            arraySortTest(i);
        }

        for (int i = 1; i <= 1_900_500; i *= 2) {
            insertionSortTest(i);
        }

        for (int i = 1; i <= 1_900_500; i *= 2) {
            mergeSortTest(i);
        }
    }

    public static int[] getRandomIntArray(int size) {
        Random random = new Random();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt();
        }
        return a;
    }

    public static void insertionSortTest(int size) {
        int[] deneme = getRandomIntArray(size);

        long baslangic = System.currentTimeMillis();
        intertionSort(deneme);
        long bitis = System.currentTimeMillis();

        System.out.println("Insertion sort'ta siralamasa suresi(" + size + ")  : " + (bitis - baslangic) / 1000F);
    }

    public static void arraySortTest(int size) {
        int[] a = getRandomIntArray(size);

        long baslangis = System.currentTimeMillis();
        Arrays.sort(a);
        long bitis = System.currentTimeMillis();

        System.out.println("Arrays sort'ta siralama suresi  (" + size + ")  :" + (bitis - baslangis) / 1000F);
    }

    public static void mergeSortTest(int size) {
        int[] a = getRandomIntArray(size);

        long baslangis = System.currentTimeMillis();
        MergeSort.mergeSort(a);
        long bitis = System.currentTimeMillis();

        System.out.println("Merge sort'ta siralama suresi  (" + size + ")  :" + (bitis - baslangis) / 1000F);

    }


}
