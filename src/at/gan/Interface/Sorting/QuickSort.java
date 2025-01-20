package at.gan.Interface.Sorting;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        quickSort(data, 0, data.length - 1);
        return data;
    }

    private void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
