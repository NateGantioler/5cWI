package at.gan.DataGenerator;

import org.junit.Test;
import org.junit.Assert;

public class BaseAlgorithmsTest {
    @Test
    public void testMax() {
        int[] data = {1, 4, 89, 24};
        int max = BaseAlgorithms.max(data);
        Assert.assertEquals(max, 89);
    }

    @Test
    public void testMin() {
        int[] data = {1, 4, 89, 24};
        int min = BaseAlgorithms.min(data);
        Assert.assertEquals(min, 1);
    }

    @Test
    public void testRevert() {
        int[] data = {1, 4, 89, 24};
        int[] result = {24, 89, 4, 1};
        int[] dataRev = new int[4];
        
        dataRev = BaseAlgorithms.revert(data);
        Assert.assertArrayEquals(dataRev, result);
    }
}
