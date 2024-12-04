package at.gan.DataGenerator;

public class BaseAlgorithms {

    public static int[] revert(int[] data)
    {
        int[] reverseData = new int[data.length];
    
        for (int i = 0; i < data.length; i++) {
            reverseData[i] = data[data.length - i - 1];
        }
        return reverseData;
    }

    public static int max(int[] data)
    {
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    public static int min(int[] data)
    {
        int min = 100;
        for (int i = 0; i < data.length; i++) {
            if(data[i] < min){
                min = data[i];
            }
        }
        return min;
    }
}
