package at.gan.Interface.Sorting;

import java.util.Random;

public class DataGenerator {

        public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random(); 
        int[] data = new int[size];  
        for (int i = 0; i < size; i++) 
        {  
            data[i] = random.nextInt(min, max);  
        }
        return data;  
    }

    public static void printArray(int[] data) {
        for (int a = 0; a < data.length; a++)
        {
            System.out.print(data[a] + "  ");
        }
    }
}
