import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IsUniqueTest {

    @Test
    public void testIsUnique() {
        String s = "abcdefgh";
        boolean isUnique = IsUnique.isUnique(s);
        Assert.assertTrue(isUnique);
    }

    @Test
    public void testIsUnique2() {
        String s = "abcdeffgh";
        boolean isUnique = IsUnique.isUnique(s);
        Assert.assertFalse(isUnique);
    }
}