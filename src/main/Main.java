package main;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ordenarInteiros();

        ordenarLocalDates();

        ordenarStrings();
    }

    private static void ordenarStrings() {
        String[] array = {
                "Aaa",
                "Files",
                "Commits",
                "Branches",
                "Tags",
                "Contributors",
                "Graph",
                "Compare",
                "Charts",
                "Issues"
        };

        System.out.println("\n___________________________");
        System.out.println("\nGiven string array is:");
        printArray(array);

        Arrays.sort(array);

        System.out.println("\nSorted A to Z string array is:");
        printArray(array);

        System.out.println("\nSorted Z to A string array is:");
        printInverseArray(array);
    }

    private static void ordenarLocalDates() {
        LocalDate[] array = {
                LocalDate.now(),
                LocalDate.of(1990, 12, 17),
                LocalDate.of(1995, 3, 16),
                LocalDate.of(1991, 12, 17),
                LocalDate.of(2001, 9, 4),
                LocalDate.of(2008, 6, 27),
                LocalDate.of(2016, 7, 2),
                LocalDate.of(2009, 12, 1),
                LocalDate.of(1962, 12, 31),
                LocalDate.of(2005, 6, 28)
        };

        System.out.println("\n___________________________");
        System.out.println("\nGiven localdate array is:");
        printArray(array);

        MergeSortDate mergeSortDate = new MergeSortDate();
        mergeSortDate.sort(array, 0, array.length - 1);

        System.out.println("\nSorted localdate array is:");
        printArray(array);
    }

    private static void ordenarInteiros() {
        Integer[] array = {12, 11, 13, 5, 6, 7, 1, 0, 99, 101};

        System.out.println("Given integer array is:");
        printArray(array);

        MergeSortInteger mergeSortInteger = new MergeSortInteger();
        mergeSortInteger.sort(array, 0, array.length - 1);

        System.out.println("\nSorted integer array is:");
        printArray(array);
    }

    private static void printArray(Object[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    private static void printInverseArray(String[] array) {
        for (int i = array.length - 1; i >= 0; --i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
