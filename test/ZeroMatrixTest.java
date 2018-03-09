import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ZeroMatrixTest {

    @Test
    public void testSetZeros1() {
        int[][] input = {   {1, 2, 3},
                            {4, 0, 6},
                            {7, 8, 9}
                        };

        int[][] expected =  {   {1, 0, 3},
                                {0, 0, 0},
                                {7, 0, 9}
                            };

        ZeroMatrix.setZeros(input);
        Assert.assertEquals(input, expected);
    }

    @Test
    public void testSetZeros2() {
        int[][] input = {   {1, 2, 0},
                            {4, 0, 6},
                            {7, 8, 9}
                        };

        int[][] expected =  {   {0, 0, 0},
                                {0, 0, 0},
                                {7, 0, 0}
                            };

        ZeroMatrix.setZeros(input);
        Assert.assertEquals(input, expected);
    }
}