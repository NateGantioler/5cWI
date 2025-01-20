package at.gan.Interface.Sorting;

import java.util.Random;

public class main {
    public static void main(String[] args) 
    {
        Sorter bubbleSort = new BubbleSort();
        Sorter insertionSort = new InsertionSort();
        Sorter selectionSort = new SelectionSort();
        //Sorter quickSort = new QuickSort();

        int[] sizes = {10_000, 100_000, 400_000};
        long[] times = new long[sizes.length];  // Array zum Speichern der Zeiten

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            int[] data = generateRandomArray(size);
            System.out.println("Testing InsertionSort with " + size + " elements...");

            long startTime = System.currentTimeMillis();
            selectionSort.sort(data);
            long endTime = System.currentTimeMillis();

            long elapsedTime = endTime - startTime;
            times[i] = elapsedTime;  // Speichern der Zeit für die aktuelle Größe

            System.out.println("Time taken for " + size + " elements: " + (elapsedTime / 1000.0) + " seconds\n");
        }

        // Ausgabe der Gesamtzeiten für alle Größen
        for (int i = 0; i < sizes.length; i++) {
            System.out.println(sizes[i] + " took " + (times[i] / 1000.0) + " seconds");
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(); // Generiert zufällige Ganzzahlen
        }
        return data;
    }
}