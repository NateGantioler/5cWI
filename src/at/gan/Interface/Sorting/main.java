package at.gan.Interface.Sorting;

public class main {
    public static void main(String[] args) 
    {
        Sorter sort1 = new BubbleSort();

        int[] list = DataGenerator.generateDataArray(10, 0, 101);
        DataGenerator.printArray(list);

        System.out.println("\n");

        int[] sortedList = sort1.sort(list);
        DataGenerator.printArray(sortedList);
    }
}
