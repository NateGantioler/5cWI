package at.gan.DataGenerator;

public class Main {
    public static void main(String[] args) {
        //int[] data1 =  DataGenerator.generateDataArray(3);
        int[] data2 =  DataGenerator.generateDataArray(4,0,100);
        int[] reverseData = BaseAlgorithms.revert(data2);
        DataGenerator.printArray(data2);
        System.out.println("\n");
        DataGenerator.printArray(reverseData);
        System.out.println("\n" + BaseAlgorithms.max(data2));
        System.out.println("\n" + BaseAlgorithms.min(data2));
    }
}
