package main;

public class Main {

    public static void main(String[] args) {

        int[] array = {12, 11, 13, 5, 6, 7, 1, 0, 99, 101};

        System.out.println("Given array is:");
        printArray(array);

        MergeSortInteger mergeSortInteger = new MergeSortInteger();
        mergeSortInteger.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array is:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
