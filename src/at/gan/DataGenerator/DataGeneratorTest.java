package at.gan.DataGenerator;

import org.junit.Assert;
import org.junit.Test;

public class DataGeneratorTest {
    @Test
    public void testGenerateDataArray() {
        int[] data1 =  DataGenerator.generateDataArray(3);
        Assert.assertEquals(data1.length, 3);
    }

    @Test
    public void testGenerateDataArray2() {
        int[] data2 =  DataGenerator.generateDataArray(8,0,100);
        for(int i = 0; i < data2.length; i++)
        {
            assert data2[i] >= 0 && data2[i] <= 100;
        }
    }

    @Test
    public void testPrintArray() {
        int[] data2 =  DataGenerator.generateDataArray(8,0,100);
        DataGenerator.printArray(data2);
    }
}
