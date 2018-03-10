import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixRotationTest {

    @Test
    /**
     * 3x3 matrix
     */
    public void matrixRotationTest() {
        int[][] actual = MatrixRotation.makeMatrix(3);

        int[][] expected = {    {9, 8, 7},
                                {6, 5, 4},
                                {3, 2, 1}
                            };

        MatrixRotation.rotateMatrix(actual);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * 4x4 matrix
     */
    public void matrixRotationTest2() {
        int[][] actual = MatrixRotation.makeMatrix(4);

        int[][] expected =  {   {16, 15, 14, 13},
                                {12, 11, 10, 9},
                                {8, 7, 6, 5},
                                {4, 3, 2, 1}
                            };

        MatrixRotation.rotateMatrix(actual);

        Assert.assertEquals(actual, expected);
    }
}